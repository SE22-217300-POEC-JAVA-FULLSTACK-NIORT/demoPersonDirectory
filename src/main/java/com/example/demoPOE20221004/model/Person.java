package com.example.demoPOE20221004.model;

import javax.persistence.*;

@Entity
@Table(name="persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@Column(name = "prenom")
	private String firstName;
	//@Column(name = "nom")
	private String lastName;

	@ManyToOne
	private Address address;
	
	
	public Person() {
	}	
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

	public void patch(Person dataToUpdate){
		if(dataToUpdate.getFirstName() != null)	{
			this.firstName = dataToUpdate.getFirstName();
		}
		if(dataToUpdate.getLastName() != null)	{
			this.lastName = dataToUpdate.getLastName();
		}
	}


}
