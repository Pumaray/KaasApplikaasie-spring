package rsvier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rsvier.model.Person;

public interface PersonRespository extends JpaRepository<Person, Long> {

	public Person findBySurname(String surename);
	
	@Query("select p from Person p where p.address.city=Groningen")
	public Person findAllPersonFromGroningen();
	

}
