package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/v1/person")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping("/api/v1/person")
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

//    @GetMapping(path="{id}")
    @GetMapping("/api/v1/person/{id}")
    public Person selectPersonById(@PathVariable("id") UUID id) {
        return personService.selectPersonById(id).orElse(null);
    }

    public int deletePersonById(UUID id) {
        return 0;
    }

    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
