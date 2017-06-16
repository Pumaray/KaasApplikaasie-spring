package rsvier.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.annotation.Secured;

import rsvier.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

	public User findUserByNameAndPassword(String name, String password);
	
	public User findUserByName(String name);
	
	public User save(User user);
	
	@Secured ({"ROLE_ADMIN"})
	public List<User> getAllUsers();
	
	
}