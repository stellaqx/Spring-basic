package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

//@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController() {
    }

    @PostMapping("/api/v1/person")
    public void addPerson(@Valid @NonNull @RequestBody Person person) {
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

    @PostMapping("/api/v1/person/{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        personService.deletePersonById(id);
    }

    @PutMapping("/api/v1/person/{id}")
    public void updatePersonById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Person person) {
        personService.updatePersonById(id, person);
    }
}
