package com.example.demoPOE20221004.controller.dto;

import com.example.demoPOE20221004.model.Person;

public class PersonMapper {

    public static PersonDTO convertToDto(Person entity){
        PersonDTO dto = new PersonDTO();
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setPostalAddress(entity.getAddress());
        dto.writeFullName();
        return dto;
    }
}
