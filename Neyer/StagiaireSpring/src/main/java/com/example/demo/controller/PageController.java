package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@GetMapping("/")
	public String home(@RequestParam(defaultValue="nom Stagiaire") String name , ModelMap modelMap) {
		
				modelMap.put("nomStagiaire", name);	
				return "vu/stagiaire";
	}
}
