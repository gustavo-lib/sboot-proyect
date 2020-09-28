package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Person;


public interface personService {

	public Person findPerson();
	
	public List<Person> getListPerson();
	
	public Person createPerson(Person p);
	
	public void update();
	
	public int delete(long id);
}
