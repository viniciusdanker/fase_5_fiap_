package repository;

import domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
	//Product FindByName(String Name);
}




