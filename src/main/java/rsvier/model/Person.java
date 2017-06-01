package rsvier.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@TableGenerator(name = "EVENT_GEN", table = "SEQUENCES", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_NUMBER", pkColumnValue = "SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "EVENT_GEN")
	@Column(name = "id")
	private final Long id;

	@NotNull
	@Column(name = "surname")
	private final String surname;

	@NotNull
	@Column(name = "last name")
	private String lastName;

	@Embedded
	private final Address address;

	@NotNull
	@Column(name = "mail address")
	private String mailAddress;

	public Person(Long id, String surname, String lastName, Address address, String mailAddress) {
		this.id = id;
		this.surname = surname;
		this.lastName = lastName;
		this.address = address;
		this.mailAddress = mailAddress;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Long getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public Address getAddress() {
		return address;
	}

	public static class PersonBuilder {
		long id;
		String surname;
		String lastName;
		Address address;
		String mailAddress;
		
		public PersonBuilder() {}
		
		public PersonBuilder surname(String name) {
			this.surname = name;
			return this;
		}
		
		public PersonBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PersonBuilder address(Address address) {
			this.address = address;
			return this;
		}
		
		public PersonBuilder mailAddress(String mailAddress) {
			this.mailAddress = mailAddress;
			return this;
		}
		
		public Person build() {
			return new Person(id, surname,lastName, address, mailAddress);
		}
	}

}
