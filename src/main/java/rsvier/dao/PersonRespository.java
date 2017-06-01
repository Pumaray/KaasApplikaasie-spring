package rsvier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rsvier.model.Person;

public interface PersonRespository extends JpaRepository<Person, Long> {

	public Person findByPersonName();
	
	@Query("select p from Person where p.city=Groningen")
	public Person findAllPersonFromGroningen();

}
