package comm.sample.mainapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comm.sample.mainapp.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
	
	

}
