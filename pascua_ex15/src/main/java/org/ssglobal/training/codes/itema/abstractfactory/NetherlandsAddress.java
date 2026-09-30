package org.ssglobal.training.codes.itema.abstractfactory;

public class NetherlandsAddress implements Address {
	private String street;
	private String city;
	private String postalCode;
	
	public NetherlandsAddress(String street, String city, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}

	@Override
	public String getAddressDetails() {
		return String.format(" ", street, city);
	}

	@Override
	public Boolean isValidAddress() {
		return postalCode != null;
	}
	
	
}
