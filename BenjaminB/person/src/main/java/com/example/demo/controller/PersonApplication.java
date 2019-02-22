package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.*;;

@Controller
public class PersonApplication {
    private static List<person> persons = new ArrayList<person>();
    
    static {
        persons.add(new person("Bill", "Gates"));
        persons.add(new person("Steve", "Jobs"));
    }
    
 
    @RequestMapping(value = {"/", "/index" }, method = RequestMethod.GET)
   @ResponseBody
    public String viewPersonList(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "index";
    }
}
