package com.example.demo.dao;

import com.example.demo.model.Person;
import com.example.demo.utils.PersonUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> id.equals(person.getId()))
                .findAny();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personOptional = selectPersonById(id);
        if (!personOptional.isPresent()) {
            return 0;
        }
        DB.remove(personOptional.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        Optional<Person> personOptional = selectPersonById(id);
        if (!personOptional.isPresent()) return 0;
        int index = DB.indexOf(personOptional.get());
        PersonUtils.personQualifierUpdate(id, person);
        DB.set(index, person);
        return 1;
    }
}
