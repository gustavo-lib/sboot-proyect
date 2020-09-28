package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Person;
import com.gortiz.proyectexample.repository.PersonRepository;
import com.gortiz.proyectexample.service.personService;


@Service ("personImp")
public class servicePersonImpl implements personService{
	
	@Autowired
	private PersonRepository personRepository ;

	@Override
	public Person findPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getListPerson() {
		// TODO Auto-generated method stub
		personRepository.findAll();
		return null;
	}

	@Override
	public Person createPerson(Person p) {
		// TODO Auto-generated method stub
		personRepository.save(p);
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
