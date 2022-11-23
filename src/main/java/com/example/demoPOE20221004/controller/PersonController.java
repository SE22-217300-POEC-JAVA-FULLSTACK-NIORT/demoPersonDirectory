package com.example.demoPOE20221004.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Person> getPerson(@PathVariable("id") Long id){
		Person person = personDirectory.getPerson(id);
		if(person == null){
			return ResponseEntity.notFound().build();
		}
		else{
			return ResponseEntity.ok(person);
		}
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

	@PutMapping("persons/{id}")
	public ResponseEntity updatePerson(@RequestBody Person person, @PathVariable("id") Long id){

		if(id != person.getId()){
			return ResponseEntity.badRequest().build();
		}
		else {

			//personDirectory.updatePerson(person, id);
			personDirectory.updatePerson2(person, id);
			return ResponseEntity.ok().build();

		}

	}

}
