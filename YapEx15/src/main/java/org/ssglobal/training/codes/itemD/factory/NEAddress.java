package org.ssglobal.training.codes.itemD.factory;

public class NEAddress extends Address {
	public NEAddress(String street, String city, String postalCode) {
		this.street = street;
		this.city = city;
		if (!validatePostalCode(postalCode))
			throw new IllegalArgumentException("Invalid NL postal code");
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
