package com.gortiz.proyectexample.service;

import java.util.List;


import com.gortiz.proyectexample.entity.Provider;

public interface providerService {

	List<Provider> getProvider();
	
    public Provider findProvider(Long id);
	
	public Provider createProvider(Provider p);
	
	public Provider update(Provider p);
	
	public void delete(Long id);
	
	public Provider fetchByIdWithProvider(Long id);
}
