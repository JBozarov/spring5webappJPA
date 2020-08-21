package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String name;
	private String addressLine1; 
	private String city; 
	private String state; 
	private String zip; 
	
	
//	@OneToMany
//	private Set<Book> books = new HashSet<>();

	public Publisher() {
		super();
	} 
	
	
	
	
}
