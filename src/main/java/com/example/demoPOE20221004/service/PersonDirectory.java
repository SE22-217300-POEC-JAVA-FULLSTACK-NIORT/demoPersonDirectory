package com.example.demoPOE20221004.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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

	public Optional<Person> getPerson(Long id) {
		for(Person person : persons){
			if(person.getId().equals(id)){
				return Optional.of(person);
			}
		}
		return Optional.empty();
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

	public void updatePerson(Person personToUpdate, Long id){
		Iterator<Person> it = persons.listIterator();
		while (it.hasNext()){
			Person person = it.next();
			if(person.getId().equals(id)){
				it.remove();
			}
		}
		persons.add(personToUpdate);
	}

	public void updatePerson2(Person personToUpdate, Long id){
		for(int i=0 ; i< persons.size() ; i++){
			Person person = persons.get(i);
			if(person.getId().equals(id)){
				persons.set(i, personToUpdate);
			}
		}
	}

	public void patchPerson(Person personToUpdate, Long id){
		for(Person person : persons){
			if(person.getId().equals(id)){
				person.patch(personToUpdate);
				break;
			}
		}
	}
}
