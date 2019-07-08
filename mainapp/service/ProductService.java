package comm.sample.mainapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.sample.mainapp.model.Product;
import comm.sample.mainapp.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;

	public Iterable<Product> listAllProducts() {
		return repo.findAll();

	}

	public Product getProductById(Integer id) {
		return repo.findById(id).get();

	}

	public Product saveProduct(Product product) {
		return repo.save(product);

	}

	public void deleteProduct(Integer id) {
		repo.deleteById(id);

	}

}
