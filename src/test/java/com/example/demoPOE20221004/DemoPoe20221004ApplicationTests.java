package com.example.demoPOE20221004;

import com.example.demoPOE20221004.dao.AddressRepository;
import com.example.demoPOE20221004.dao.PersonRepository;
import com.example.demoPOE20221004.dao.StageRepository;
import com.example.demoPOE20221004.model.Address;
import com.example.demoPOE20221004.model.Person;
import com.example.demoPOE20221004.model.Stage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
class DemoPoe20221004ApplicationTests {

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	StageRepository stageRepository;

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
		Optional<Person> personOptional = personRepository.findById(1L);
		if(personOptional.isPresent()){
			Person person = personOptional.get();
			System.out.println(person);
			Address a = person.getAddress();
			System.out.println(a);
		}
	}

	@Test
	void testAjoutAdressMarie(){
		Optional<Person> personOptional = personRepository.findById(1L);
		if(personOptional.isPresent()){
			Person marie = personOptional.get();

			Optional<Address> addressOptional = addressRepository.findById(2L);
			if(addressOptional.isPresent()){
				Address adresseDeMarie = addressOptional.get();

				marie.setAddress(adresseDeMarie);
				personRepository.save(marie);
			}
		}
	}


	@Test
	void testStages(){
		Stage yoga = new Stage();
		yoga.setTitre("Initiation au Yoga");
		yoga.setTarif(300);
		yoga.setDate(LocalDate.of(2022, 12, 29));
		stageRepository.save(yoga);

		Stage salsa = new Stage();
		salsa.setTitre("Initiation dance Salsa");
		salsa.setTarif(300);
		salsa.setDate(LocalDate.of(2022, 12, 30));
		stageRepository.save(salsa);

		Optional<Person> marieOptional = personRepository.findById(1L);
		Optional<Person> mikeOptional = personRepository.findById(3L);
		Optional<Person> alainOptional = personRepository.findById(4L);

		if(marieOptional.isPresent()
				&& mikeOptional.isPresent() && alainOptional.isPresent()){
			Person marie = marieOptional.get();
			Person mike = mikeOptional.get();
			Person alain = alainOptional.get();


			yoga.addStagiaire(mike);
			yoga.addStagiaire(marie);
			stageRepository.save(yoga);

			salsa.addStagiaire(marie);
			salsa.addStagiaire(alain);
			stageRepository.save(salsa);

		}

	}


}
