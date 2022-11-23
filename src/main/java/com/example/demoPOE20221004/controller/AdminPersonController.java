package com.example.demoPOE20221004.controller;

import com.example.demoPOE20221004.model.Person;
import com.example.demoPOE20221004.service.PersonDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminPersonController {

    @Autowired
    private PersonDirectory personDirectory;

    @GetMapping("persons")
    public List<Person> getPersons(){
        return personDirectory.getPersons();
    }


}
