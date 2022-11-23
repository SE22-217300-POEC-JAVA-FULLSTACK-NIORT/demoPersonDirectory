package com.example.demoPOE20221004.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("persons/{id}")
	public Person getPerson(@PathVariable("id") Long id){

		return personDirectory.getPerson(id);
	}
	
	@PostMapping("persons")
	public Person postPerson(@RequestBody Person newPerson) {
		personDirectory.addPerson(newPerson);		
		return newPerson;
	}

	@DeleteMapping("persons/{id}")
	public void deletePerson(@PathVariable("id") Long id){
		personDirectory.deletePerson(id);
	}

}
