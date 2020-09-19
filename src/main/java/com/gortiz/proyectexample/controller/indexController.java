package com.gortiz.proyectexample.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.model.Person;

@Controller
@RequestMapping("index")
public class indexController {

	// listPerson<Person>= new ArrayList<Person>();
	List<Person> people =new ArrayList<>();
	@GetMapping("/star")
	public ModelAndView fisrtpage2() {
		ModelAndView model=new ModelAndView("index");
		people.add(new Person(1,"Rocio ","Alvarez",new Date(),"Argentina"));
		people.add(new Person(2,"Gustavo","Ortiz",new Date(),"Argentina"));
		people.add(new Person (3,"Erica","Diaz",new Date(),"Colombia"));
		people.add(new Person(4,"Lucas","Ortiz",new Date(),"Brasil"));
		people.add(new Person(5,"Fernando","Ortiz",new Date(),"Argentina"));
		people.add(new Person(6,"Rocio","Alvarez",new Date(),"España"));
		model.addObject("list", people);System.out.println("logger two ...");
		return model;
	}

	
	@GetMapping("edit/{id}")
	public ModelAndView editPerson(@PathVariable("id") int id) {
		Person person= this.people.get(id);System.out.println("logger...");
		ModelAndView model=new ModelAndView("edit"); 
		return model;
	}
}
