package com.example.jdhomeworks_springjpa_task1.controller;

import com.example.jdhomeworks_springjpa_task1.entity.Person;
import com.example.jdhomeworks_springjpa_task1.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonByAgeLessThanOrderBy(int age) {
        return service.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

    @PostMapping("/save")
    public Person save(Person person) {
        return service.save(person);
    }

    @GetMapping("/count")
    public Long count() {
        return service.count();
    }

    @PostMapping("/delete-list")
    public void deleteAllPersons(List<Person> personList) {
        service.deleteAllPersons(personList);
    }
}