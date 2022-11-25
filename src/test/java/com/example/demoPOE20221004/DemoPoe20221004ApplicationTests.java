package com.example.demoPOE20221004;

import com.example.demoPOE20221004.dao.AddressRepository;
import com.example.demoPOE20221004.model.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoPoe20221004ApplicationTests {

	@Autowired
	AddressRepository addressRepository;

	@Test
	void testAddress() {
		Address address1 = new Address("Rue de la Mairie", 12, "Paris");
		addressRepository.save(address1);
	}

}
