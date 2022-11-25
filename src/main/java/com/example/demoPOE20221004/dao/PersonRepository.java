package com.example.demoPOE20221004.dao;

import com.example.demoPOE20221004.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByLastName(String lastName);
    List<Person> findAllByLastNameContains(String partialLastName);

}