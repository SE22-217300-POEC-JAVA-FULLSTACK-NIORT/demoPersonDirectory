package com.example.demoPOE20221004.service;

import java.util.ArrayList;
import java.util.Iterator;
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

	public Person getPerson(Long id) {
		for(Person person : persons){
			if(person.getId().equals(id)){
				return person;
			}
		}
		return null; // à améliorer avec l'utilisation d'un Optional
	}

	public void deletePerson(Long id){
		Iterator<Person> it = persons.listIterator();


		while (it.hasNext()){
			Person person = it.next();
			if(person.getId().equals(id)){
				it.remove();
			}
		}
	}

}
