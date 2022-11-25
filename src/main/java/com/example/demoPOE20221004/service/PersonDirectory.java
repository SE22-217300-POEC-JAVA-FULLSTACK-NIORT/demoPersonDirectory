package com.example.demoPOE20221004.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.example.demoPOE20221004.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoPOE20221004.model.Person;

@Service
public class PersonDirectory {

	@Autowired
	private PersonRepository personRepository;
	
	public void addPerson(Person newPerson) {

		personRepository.save(newPerson);
	}
	
	public List<Person> getPersons(){
		return personRepository.findAll();
	}

	public Optional<Person> getPerson(Long id) {
		return personRepository.findById(id);
	}

	public void deletePerson(Long id){
		personRepository.deleteById(id);
	}

	public void updatePerson(Person personToUpdate, Long id){
		personRepository.save(personToUpdate);
	}

	public void patchPerson(Person personToUpdate, Long id){
		Optional<Person> op = personRepository.findById(id);
		if(op.isPresent()){
			Person person = op.get();
			person.patch(personToUpdate);
			personRepository.save(person);
		}
	}

	public List<Person> searchByLastName(String lastName) {
		return personRepository.findAllByLastName(lastName);
	}

	public List<Person> searchByLastNameContains(String partialLastName) {
		return personRepository.findAllByLastNameContains(partialLastName);
	}
}
