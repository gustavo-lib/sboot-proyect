package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.model.Person;

@Controller
@RequestMapping("index")
public class indexController {

	// listPerson<Person>= new ArrayList<Person>();
	List<Person> people =new ArrayList<>();
	//people.add(new Person("Romina","Velazquez",new Date (),"Argentina"));
	
	
	@GetMapping("/star")
	public ModelAndView fisrtpage2() {
		ModelAndView model=new ModelAndView("index");
		model.addObject("persona", new Person("gustavo","ortiz", null, "Argentina"));
		people.add(new Person("Daina","Lopez",null,"Argentina"));
		people.add(new Person("Erica","Diaz",new Date(),"Colombia"));
		people.add(new Person("Lucas","Ortiz",new Date(),"Argentina"));
		model.addObject("list", people);
		return model;
	}

	/*
	 * @GetMapping("/home") public String firstpage() { ModelAndView model=new
	 * ModelAndView(); return "index"; }
	 */
	
}
