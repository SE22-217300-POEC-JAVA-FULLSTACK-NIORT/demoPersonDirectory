package com.example.demoPOE20221004;

import com.example.demoPOE20221004.dao.AddressRepository;
import com.example.demoPOE20221004.model.Address;
import com.example.demoPOE20221004.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

class DemoPoe20221004ApplicationUnitTests {

	@Test
	void testUpdateLastName() {
		Person alain = new Person("Alain", "Delon");
		alain.setLastName("Durand");
		assertEquals("Durand", alain.getLastName());
	}

}
