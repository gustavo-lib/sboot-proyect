package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.repository.ProviderRepository;
import com.gortiz.proyectexample.service.ProviderService;


@Service("serviceProviderImpl")
public class ServiceProviderImpl implements ProviderService {

	@Autowired
	@Qualifier("providerRepository")
	private ProviderRepository providerRepository;
	
	@Override
	public Provider findProvider(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Provider> getListProvider() {
		// TODO Auto-generated method stub
		return providerRepository.findAll();
		
	}

	@Override
	public Provider createProvider(Provider p) {
		// TODO Auto-generated method stub
		return providerRepository.save(p);
		//return null;
	}

	@Override
	public Provider update(Provider p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
