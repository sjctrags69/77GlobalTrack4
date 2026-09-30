package org.ssglobal.training.codes;

public class NorthAmericaAddressStrategy implements AddressStrategy {

	@Override
	public boolean validatePostalCode(String postalCode) {
		return postalCode != null && postalCode.matches("\\d{5}");
	}

	@Override
	public String getCountryName() {
		return "North America";
	}
}
