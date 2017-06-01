package rsvier.service;

import java.util.List;

import rsvier.model.Person;

public interface PersonService {
	
	Person find(long id);
	
	void remove(long id);
	
	void persist(Person person);

	void merge(Person person);

	void removeByName(String personName);

	List<Person> findAll();

	Person findPersonByName(String personName);
}
