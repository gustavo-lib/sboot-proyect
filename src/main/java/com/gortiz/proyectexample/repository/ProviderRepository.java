package com.gortiz.proyectexample.repository;




import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


import com.gortiz.proyectexample.entity.Provider;

@Repository("providerRepository")
public interface ProviderRepository extends JpaRepositoryImplementation<Provider, Long> {
	
	
}
