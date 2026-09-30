package org.ssglobal.training.codes.itemD.factory;

public class USAddress extends Address {
	public USAddress(String street, String city, String postalCode) {
		this.street = street;
		this.city = city;
		if (!validatePostalCode(postalCode))
			throw new IllegalArgumentException("Invalid US ZIP code");
		this.postalCode = postalCode;
	}

	@Override
	public boolean validatePostalCode(String postalCode) {
		return true;
	}

	@Override
	public String display() {
		return null;
	}
}
