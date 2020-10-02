package com.gortiz.proyectexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class StartWelcome {

	@GetMapping("/")
	String page1() {
		return "welcome";
	}
	
	
	@GetMapping("/1login")
	String pagelogin() {
		return "login";
	}
	
	@GetMapping("/1contact")
	String pageContact() {
		return "contact";
	}
	
}
