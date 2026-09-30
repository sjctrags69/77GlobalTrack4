package org.ssglobal.training.codes.itema.abstractfactory;

public class NorthAmericaAddress implements Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	
	public NorthAmericaAddress(String street, String city, String state, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	@Override
	public String getAddressDetails() {
		return String.format(" ", street, city, state);
	}

	@Override
	public Boolean isValidAddress() {
		return postalCode != null;
	}
}
