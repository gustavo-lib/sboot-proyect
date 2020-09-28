package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.entity.Person;
import com.gortiz.proyectexample.service.personService;

@Controller

@RequestMapping("/home/")
public class indexController {

	// listPerson<Person>= new ArrayList<Person>();
	
	@Autowired
	@Qualifier("personImp")
	private personService personService;
	List<Person> people =new ArrayList<>();
	
	private static final Logger logger = LoggerFactory.getLogger(indexController.class);

	
	@GetMapping("list")
	public ModelAndView fisrtpage2() {
		
		
		ModelAndView model=new ModelAndView("index");
		/*people.add(new Person(0,"Rocio ","Alvarez","rricarte@gmail.com","Argentina"));
		people.add(new Person(1,"Gustavo","Ortiz","gortiz@gmail.com","Argentina"));
		people.add(new Person (2,"Erica","Diaz","ediaz@gmail.com","Colombia"));
		people.add(new Person(3,"Lucas","Ortiz","lortiz@gmail.com","Brasil"));
		people.add(new Person(4,"Fernando","Ortiz","fortiz@gmail.com","Argentina"));
		people.add(new Person(5,"Rocio","Alvarez","ralvarez@gmail.com","España"));*/
		model.addObject("list", personService.getListPerson());
		
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
	
	@GetMapping("showform")
	public String formShow(Model model) {
		//Person persona=new Person();
		model.addAttribute("person", new Person());
		return "form";
	}
	
	@PostMapping("add")
	public String redirect(@ModelAttribute("person") Person p) {
		//falta la validacion de persona que no sean nulos y ademas que no sean tipos de datos erroneos
		people.add(p);
		personService.createPerson(p);
		this.logger.info("dsa "+ p.toString());
		return "redirect:list";
	}
}
