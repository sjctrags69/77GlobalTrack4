package org.ssglobal.training.codes;

public class Address {
	private String street;
	private String city;
	private String postalCode;
	private AddressStrategy addressStrategy;

	public Address(String street, String city, String postalCode, AddressStrategy addressStrategy) {
		this.street = street;
		this.city = city;
		this.addressStrategy = addressStrategy;
		setPostalCode(postalCode);
	}

	public void setPostalCode(String postalCode) {
		if (!addressStrategy.validatePostalCode(postalCode)) {
			throw new IllegalArgumentException(String.format("Postal code %s does not follow the %s format.",
					postalCode, addressStrategy.getCountryName()));
		}
		this.postalCode = postalCode;
	}

	public void setAddressStrategy(AddressStrategy addressStrategy) {
		this.addressStrategy = addressStrategy;
	}

	public AddressStrategy getAddressStrategy() {
		return addressStrategy;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void showAddress() {
		System.out.printf("%s, %s %s (%s)\n", street, city, postalCode, addressStrategy.getCountryName());
	}
}
