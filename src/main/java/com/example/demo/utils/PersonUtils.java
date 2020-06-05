package com.example.demo.utils;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersonUtils {
    // make sure the Dao persists a person with non null id
    public static void personQualifierAdd(Person person) {
        UUID id;
        if (person.getId() == null || person.getId().toString().isEmpty()) {
            id = UUID.randomUUID();
            person.setId(id);
        }
    }

    public static void personQualifierUpdate(UUID id, Person person) {
        person.setId(id);
    }
}
