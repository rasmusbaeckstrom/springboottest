package org.example.springboottest.controller;

import org.example.springboottest.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/info")
    public String info() {
        return "Hello World!";
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return List.of(
                new Person("Alice", true),
                new Person("Bob", false),
                new Person("Charlie", true)
        );
    }
}
