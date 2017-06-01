package rsvier.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import rsvier.model.Person;
import rsvier.model.User;

public interface UserRepository extends JpaRepository<Person, Long> {

	public User findUserByNameAndPassword(String name, String password);
	
	
}