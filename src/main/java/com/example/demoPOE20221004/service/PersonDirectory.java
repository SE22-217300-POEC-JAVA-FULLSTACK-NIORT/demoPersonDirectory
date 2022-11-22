package com.example.demoPOE20221004.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoPOE20221004.model.Person;

@Service
public class PersonDirectory {
	
	private List<Person> persons = new ArrayList<>();
	private Long nextId = 0L;
	
	public void addPerson(Person newPerson) {
		
		nextId++;
		newPerson.setId(nextId);
		persons.add(newPerson);
	}
	
	public List<Person> getPersons(){
		return persons;
	}

}
