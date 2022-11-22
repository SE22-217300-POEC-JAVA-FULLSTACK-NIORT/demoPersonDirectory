package com.example.demoPOE20221004.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoPOE20221004.model.Person;

@RestController
public class PersonController {
	
	@GetMapping("persons")
	public List<Person> getPersons(){
		List<Person> persons = new ArrayList<>();
		persons.add( new Person("Alain", "Delon"));
		persons.add( new Person("Marie", "Dupont"));
		return persons;
	}
	
	@GetMapping("person")
	public Person getPerson(){
		return new Person("Alain", "Delon");
	}

}
