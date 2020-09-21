package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.model.Person;

@Controller
@RequestMapping("/home/")
public class indexController {

	// listPerson<Person>= new ArrayList<Person>();
	List<Person> people =new ArrayList<>();
	@GetMapping("list")
	public ModelAndView fisrtpage2() {
		
		
		ModelAndView model=new ModelAndView("index");
		people.add(new Person(0,"Rocio ","Alvarez","rricarte@gmail.com","Argentina"));
		people.add(new Person(1,"Gustavo","Ortiz","gortiz@gmail.com","Argentina"));
		people.add(new Person (2,"Erica","Diaz","ediaz@gmail.com","Colombia"));
		people.add(new Person(3,"Lucas","Ortiz","lortiz@gmail.com","Brasil"));
		people.add(new Person(4,"Fernando","Ortiz","fortiz@gmail.com","Argentina"));
		people.add(new Person(5,"Rocio","Alvarez","ralvarez@gmail.com","España"));
		model.addObject("list", people);
		return model;
	}

	
	@GetMapping("edit/{id}")
	public String editPerson(@PathVariable("id") int id, Model model) {
		
		Person personFind= this.people.get(id);
		//p=personFind;
		model.addAttribute("persona",personFind);
		//ModelAndView model=new ModelAndView("edit"); 
		return "edit";
	}
	
		
	//@PostMapping("delete/{id}")
	@GetMapping("delete/{id}") //pagina de eliminacion 
	public String hola(@PathVariable("id") int id, Model model) {
		ModelAndView hola=new ModelAndView();
		return "delete";
	}
	
	@GetMapping("/form")
	public String formShow() {
		return "form";
	}
	
	@PostMapping("/form")
	public String redirect() {
		return "joder";
	}
}
