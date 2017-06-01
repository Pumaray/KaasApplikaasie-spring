package rsvier.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

public class User {

	@Id
	@TableGenerator(name = "EVENT_GEN", table = "SEQUENCES", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_NUMBER", pkColumnValue = "SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "EVENT_GEN")
	@Column(name = "id")
	private final long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "password")
	private char[] password;

	@NotNull
	@Column(name = "Role")
	private Role role;

	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID")
	private Person person;

	public User(long id, String name, char[] password, Role role, Person person) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public long getId() {
		return id;
	}

	public enum Role {
		ADMIN, EMPLOYEE, CLIENT;
	}
}
