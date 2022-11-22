package com.example.demoPOE20221004.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoPOE20221004.model.Person;
import com.example.demoPOE20221004.service.PersonDirectory;

@RestController
@RequestMapping("api")
public class PersonController {
	
	@Autowired
	private PersonDirectory personDirectory;
	
	@GetMapping("persons")
	public List<Person> getPersons(){
		
		return personDirectory.getPersons();
	}
	
//	@GetMapping("person")
//	public Person getPerson(){
//		return new Person("Alain", "Delon");
//	}
	
	@PostMapping("persons")
	public Person postPerson(@RequestBody Person newPerson) {
		personDirectory.addPerson(newPerson);		
		return newPerson;
	}

}
