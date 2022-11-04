package com.example.jdhomeworks_springjpa_task1.service;

import com.example.jdhomeworks_springjpa_task1.entity.Person;
import com.example.jdhomeworks_springjpa_task1.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonRepository repository;

    public Service(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Long count() {
        return repository.count();
    }

    public void deleteAllPersons(List<Person> personList) {
        repository.deleteAll(personList);
    }
}
