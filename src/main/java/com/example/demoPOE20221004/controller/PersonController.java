package com.example.demoPOE20221004.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoPOE20221004.model.Person;

@RestController
@RequestMapping("api")
public class PersonController {
	
	private List<Person> persons = new ArrayList<>();
	
	@GetMapping("persons")
	public List<Person> getPersons(){
		
		return persons;
	}
	
	@GetMapping("person")
	public Person getPerson(){
		return new Person("Alain", "Delon");
	}
	
	@PostMapping("persons")
	public Person postPerson(@RequestBody Person newPerson) {
		persons.add(newPerson);		
		return newPerson;
	}

}
