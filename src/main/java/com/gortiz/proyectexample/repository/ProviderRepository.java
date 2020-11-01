package com.gortiz.proyectexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gortiz.proyectexample.entity.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long>{

}
