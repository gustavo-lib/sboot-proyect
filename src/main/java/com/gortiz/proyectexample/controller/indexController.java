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


/*
 import javax.validation.Valid;

 */
@Controller

@RequestMapping("/home/")
public class indexController {

		
	@Autowired
	@Qualifier("personImpl")
	private personService personService;
	List<Person> people =new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(indexController.class);

	@GetMapping("list")
	public ModelAndView fisrtpage2() {
		ModelAndView model=new ModelAndView("index");
		model.addObject("list", personService.getListPerson());
		return model;
	}

	
	@GetMapping("edit/{id}")
	public String editPerson(@PathVariable("id") long id, Model model) {
		Person personFind= personService.findPerson(id);//this.people.get(id);
		model.addAttribute("person",personFind);
		logger.info("OBJECT TO EDIT   "+ personFind.toString());
		return "edit";
	}
	
	@PostMapping("edit/{id}/update")
	public String update(@ModelAttribute("person") Person p ) {
		personService.update(p);
		logger.info("OBJECT UPDATE "+ p.toString());
		return "redirect:/home/list";
	}
	
		
	@GetMapping("delete/{id}") 
	public String hola(@PathVariable("id") long id, Model model) {
		logger.info("OBJECT TO DELETE "+ personService.findPerson(id).toString());
		personService.delete(id);
		return "redirect:/home/list";
	}
	
	@GetMapping("showform")
	public String formShow(Model model) {
		model.addAttribute("person", new Person());
		return "form";
	}
	
	@PostMapping("add")
	public String redirect(@ModelAttribute("person") Person p) {
		//falta la validacion de persona que no sean nulos y ademas que no sean tipos de datos erroneos
		logger.info("OBJECT ADD "+ p.toString());
		personService.createPerson(p);
		return "redirect:list";
	}
	
		
}
