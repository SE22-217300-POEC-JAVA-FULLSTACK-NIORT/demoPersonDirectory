package com.example.demoPOE20221004.controllermvc;

import com.example.demoPOE20221004.model.Person;
import com.example.demoPOE20221004.service.PersonDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonMvcController {

    @Autowired
    PersonDirectory personDirectory;

    @GetMapping("persons")
    public ModelAndView displayPersons(){
        // creation de l'objet View
        ModelAndView view = new ModelAndView("persons.html");

        // transmission de données Java à la vue
        view.addObject("persons", personDirectory.getPersons());

        // on retourne la vue à afficher
        return view;
    }

    @PostMapping("persons")
    public ModelAndView saveNewPerson(Person person){
        personDirectory.addPerson(person);

        return displayPersons();
    }
}
