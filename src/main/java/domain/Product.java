package domain; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	//@NotNull
	private String name;
	private String description;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private domain.Category category;
	public Product() {

	}

	public Product(final long id, final String name, final String description, final domain.Category category) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	public domain.Category getCategory() {
		return category;
	}

	public Product setCategory(domain.Category category) {
		this.category = category;
		return this;
	}

	//public Product setCategory(com.example.demo.Category category) {
	//	this.category = category;
	//	return this;
	//}

	

}
