package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String getHomePage(){
		
		return "index";
	}
	
	@RequestMapping(value="/about")
	public String getAboutPage(){
		return "about";
	}

}
