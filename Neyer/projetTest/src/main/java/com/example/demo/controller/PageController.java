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
	
	public String home(@RequestParam(defaultValue = "World", required=false) String name, ModelMap modelMap) {
		//String name = request.getParameter("name") != null && !request.getParameter("name").isEmpty()
			//	? request.getParameter("name") : "World";
		modelMap.put("name", name);
		return "pages/home";
	}
} 