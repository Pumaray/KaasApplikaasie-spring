package rsvier.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Address {

	@NotNull
	@Column(name = "Street Name")
	private final String streetName;

	@NotNull
	@Column(name = "Street Number")
	private final int streetNumber;

	@NotNull
	@Column(name = "City")
	private final String city;

	@NotNull
	@Column(name = "Zip Code")
	private final String zipCode;

	public Address(String streetName, int streetNumber, String zipCode, String city) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}
	
	public static class AddressBuilder {
		String streetName;
		int streetNumber;
		String city;
		String zipCode;
		
		public AddressBuilder() {}
		
		public AddressBuilder streetName(String streetName) {
			this.streetName = streetName;
			return this;
		}
		
		public AddressBuilder streetNumber(int number) {
			this.streetNumber = number;
			return this;
		}
		
		public AddressBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public AddressBuilder zipCode(String zipcode) {
			this.zipCode = zipcode;
			return this;
		}
		
		public Address build() {
			return new Address(streetName, streetNumber, zipCode, city);
		}
	}

}
