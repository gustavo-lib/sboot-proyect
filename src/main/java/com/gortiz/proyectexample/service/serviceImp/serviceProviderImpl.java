package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.providerService;
import com.gortiz.proyectexample.repository.ProviderRepository;

public class serviceProviderImpl implements providerService {

	@Autowired
	ProviderRepository providerRepository; 
	
	@Override
	public List<Provider> getProvider() {
		// TODO Auto-generated method stub
		return providerRepository.findAll();
		//return null;
	}

}
