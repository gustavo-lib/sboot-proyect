package com.gortiz.proyectexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.gortiz.proyectexample.entity.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
