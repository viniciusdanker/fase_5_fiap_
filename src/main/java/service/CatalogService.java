package service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import domain.Category;
import domain.Product;
import repository.CategoryRepository;
import repository.ProductRepository;


@Service
public class CatalogService {
	
	private static ProductRepository productRepository;
	private static CategoryRepository categoryRepository;
	
	@Autowired
	public CatalogService(final ProductRepository productRepository, final CategoryRepository categoryRepository) {
	
		this.productRepository = productRepository; 
	    this.categoryRepository  = categoryRepository;   
	}
	
	
	@Transactional
	public static Product add(final String name, String description) {
		return productRepository.save(new Product().setName(name).setDescription(description).setCategory(getDefaultCategory()));
		
	}

	private static Category getDefaultCategory() {
		final String name = "Padrão";
		final Category found = categoryRepository.findByName(name);
		
		if (found != null) {
			return found;
		}
		
		return categoryRepository.save(new Category().setName(name).setDescription("Categoria Padrao"));
		
	}

}
