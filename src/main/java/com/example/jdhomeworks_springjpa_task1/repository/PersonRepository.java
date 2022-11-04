package com.example.jdhomeworks_springjpa_task1.repository;

import com.example.jdhomeworks_springjpa_task1.entity.Person;
import com.example.jdhomeworks_springjpa_task1.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> findByCity(String city);
    List<Person> findByAgeLessThanOrderByAge(int age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}