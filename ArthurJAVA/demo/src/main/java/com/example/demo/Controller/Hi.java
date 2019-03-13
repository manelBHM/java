package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.Person;


 
@Controller
public class Hi {
	
	private static List<Person> list = new ArrayList<Person>();
	private static Person p1 = new Person("Arthur", "do");
	private static Person p2 = new Person("Mat", "Su");
	
	static {
		list.add(p1);
		list.add(p2);		
	}
 	
    @RequestMapping(value = { "/person" }, method = RequestMethod.GET)
	@ResponseBody
	public String methode(Model model) {
    	model.addAttribute("list",list);
    	return "personList";
    }   
}
