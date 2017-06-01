package rsvier.dao2;

import java.util.concurrent.ThreadLocalRandom;

import rsvier.model.Address;
import rsvier.model.Person;

public class Generator {
	
	public Person generatePerson(int index) {
		return new Person.PersonBuilder()
				.surname("Surname " + index)
				.lastName("Lastname " + index)
				.mailAddress("PO BOX " + index)
				.address(new Address.AddressBuilder()
						.city("City" + index)
						.streetName("Street" + index)
						.streetNumber(index)
						.zipCode(Integer.toString(ThreadLocalRandom.current().nextInt(1000, 9999)) + "AA")
						.build())
				.build();
				
	}

}
