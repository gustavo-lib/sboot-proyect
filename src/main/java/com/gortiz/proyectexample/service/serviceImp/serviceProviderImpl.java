package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Product;
import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.productService;
import com.gortiz.proyectexample.service.providerService;
import com.gortiz.proyectexample.repository.ProviderRepository;

@Service("providerImpl")
public class serviceProviderImpl implements providerService {

	@Autowired
	@Qualifier("respositoryProvider")
	ProviderRepository providerRepository; 
	
	/*@Autowired
	@Qualifier("repositoryProduct")
	productService productRepository ;*/
	
	@Override
	public List<Provider> getProvider() {
		// TODO Auto-generated method stub
		return providerRepository.findAll();
		//return null;
	}

	@Override
	public Provider findProvider(long id) {
		// TODO Auto-generated method stub
		//return providerRe
		return null;
	}

	@Override
	public Provider createProvider(Provider p) {
		// TODO Auto-generated method stub
		return null;
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

	public void saveProducto(Product p) {
		// TODO Auto-generated method stub
		//productRepository.createProduct(p);
		
	}

	
	@Override
	public Provider fetchByIdWithProvider(Long id) {
		// TODO Auto-generated method stub
		return providerRepository.fecthfetchByIdWithProduct(id);
		
	}

}
