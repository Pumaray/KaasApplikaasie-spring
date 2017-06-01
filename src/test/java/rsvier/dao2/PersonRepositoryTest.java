package rsvier.dao2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rsvier.dao.PersonRespository;
import rsvier.dao.conf.JpaConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
	
	private Generator gen = new Generator();
	
	@Autowired
	private PersonRespository repos;
	
	@Test
	public void testSavePerson() {
		assertNotNull(repos.save(gen.generatePerson(1)));
	}
}
