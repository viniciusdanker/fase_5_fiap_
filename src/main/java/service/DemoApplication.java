package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import domain.Product;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private CatalogService catalogService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		Line();
		System.out.println("DemoApplication.run");
		System.out.println("Criar produto");
		final Product add = CatalogService.add("produto 1","Descrição 1");
		System.out.println(add); 
		//System.out.println(add.getName());
		//System.out.println(add.getDescription());
		//System.out.println(add.getCategory().getName());
		//System.out.println(add.getCategory().getId());
		//System.out.println(add.getCategory().getDescription());
		Line();
	}

	private void Line() {
		System.out.println();
		System.out.println("==============================");
		System.out.println();
	}

}
