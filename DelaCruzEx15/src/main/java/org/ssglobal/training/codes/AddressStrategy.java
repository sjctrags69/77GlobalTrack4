package org.ssglobal.training.codes;

public interface AddressStrategy {
	boolean validatePostalCode(String postalCode);

	String getCountryName();
}
