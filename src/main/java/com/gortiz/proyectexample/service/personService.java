package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Person;


public interface personService {

	public Person findPerson(long id);
	
	public List<Person> getListPerson();
	
	public Person createPerson(Person p);
	
	public Person update(Person p);
	
	public void delete(long id);
}
