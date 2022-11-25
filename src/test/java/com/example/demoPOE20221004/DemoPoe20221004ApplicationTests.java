package com.example.demoPOE20221004;

import com.example.demoPOE20221004.dao.AddressRepository;
import com.example.demoPOE20221004.dao.PersonRepository;
import com.example.demoPOE20221004.model.Address;
import com.example.demoPOE20221004.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class DemoPoe20221004ApplicationTests {

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	PersonRepository personRepository;

	//@Test
	void testAddress() {
		Address address1 = new Address("Rue de la Mairie", 12, "Paris");
		addressRepository.save(address1);
	}

	@Test
	void testRelationPersonAddress(){
		Address address1 = new Address("Rue de la Cannebierre", 33, "Marseille");
		addressRepository.save(address1);

		Person alain = new Person("Alain", "Delon");
		alain.setAddress(address1);
		personRepository.save(alain);
	}

	@Test
	void testLecturePerson(){
		Optional<Person> personOptional = personRepository.findById(4L);
		if(personOptional.isPresent()){
			Person person = personOptional.get();
			System.out.println(person);
			Address a = person.getAddress();
			System.out.println(a);
		}
	}

}
