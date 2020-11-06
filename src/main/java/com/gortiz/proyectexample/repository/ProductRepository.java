package com.gortiz.proyectexample.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.gortiz.proyectexample.entity.Product;

@Repository("repositoryProduct")
public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {

}
