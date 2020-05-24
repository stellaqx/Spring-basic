package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.name = name;
        if (id == null || id.toString().isEmpty()) {
            this.id = UUID.randomUUID();
        } else {
            this.id = id;
        }
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final UUID id;
    private final String name;
}
