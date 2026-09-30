package org.ssglobal.training.codes;

public interface PhoneNumberStrategy {
	boolean validateNumber(String number);

	String getCountryName();
}
