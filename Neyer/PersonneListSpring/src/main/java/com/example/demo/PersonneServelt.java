package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonneServelt {
	
	@RequestMapping("/list")//on met entre (), le nom de la servelette
	@ResponseBody
	public String hello() {
	
	return  "ListPersonne";
	}
}