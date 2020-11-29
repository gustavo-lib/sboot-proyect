package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Person;
import com.gortiz.proyectexample.repository.PersonRepository;
import com.gortiz.proyectexample.service.personService;

@Service("personImpl")
public class servicePersonImpl implements personService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person findPerson(long id) {
		Optional <Person> optional = personRepository.findById(id);
		Person p = null;
		if (optional.isPresent()) {
			 p = optional.get();
		} else {
			throw new RuntimeException(" La persona no fue encontrada cajetudo  :: " + id);
		}
		return p;
		// return null;
	}

	@Override
	public List<Person> getListPerson() {
		// TODO Auto-generated method stub

		return personRepository.findAll();
	}

	@Override
	public Person createPerson(Person p) {
		// TODO Auto-generated method stub
		System.out.println("**************** "+p.toString());
		return personRepository.save(p);
		
	}

	@Override
	public Person update(Person p) {
		// TODO Auto-generated method stub
		return personRepository.save(p);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	
	}

}
