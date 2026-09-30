package org.ssglobal.training.codes;

public class NetherlandsAddressStrategy implements AddressStrategy {

	@Override
	public boolean validatePostalCode(String postalCode) {
		return postalCode != null && postalCode.matches("\\d{4} [A-Z]{2}");
	}

	@Override
	public String getCountryName() {
		return "Netherlands";
	}
}
