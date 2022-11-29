package com.example.demoPOE20221004.controller.dto;

import com.example.demoPOE20221004.model.Address;


public class PersonDTO {

	private String firstName;

	private String lastName;

	private Address PostalAddress;

	private String fullName;


	public PersonDTO() {
	}

	public PersonDTO(String firstName, String lastName) {
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

	public Address getPostalAddress() {
		return PostalAddress;
	}

	public void setPostalAddress(Address postalAddress) {
		PostalAddress = postalAddress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void patch(PersonDTO dataToUpdate){
		if(dataToUpdate.getFirstName() != null)	{
			this.firstName = dataToUpdate.getFirstName();
		}
		if(dataToUpdate.getLastName() != null)	{
			this.lastName = dataToUpdate.getLastName();
		}
	}

	public void writeFullName(){
		this.fullName = firstName + " " + lastName;
	}
}
