package com.example.demoPOE20221004.dao;

import com.example.demoPOE20221004.model.Address;
import com.example.demoPOE20221004.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}