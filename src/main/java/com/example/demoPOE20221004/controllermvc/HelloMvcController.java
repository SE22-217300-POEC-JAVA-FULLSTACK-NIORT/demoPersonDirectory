package com.example.demoPOE20221004.controllermvc;

import com.example.demoPOE20221004.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloMvcController {

    @GetMapping("hello-thymeleaf")
    public String helloThymeleaf(Model model){

        String prenom = "Jean";

        model.addAttribute("prenom",prenom);
        return "hello.html";
    }

    @GetMapping("hello2")
    public ModelAndView hello2(){

        String prenom = "Jean";

        ModelAndView view = new ModelAndView("hello.html");
        view.addObject("prenom", prenom);

        return view;
    }
}
