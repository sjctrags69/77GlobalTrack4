package org.ssglobal.training.codes;

public class NorthAmericaPhoneNumberStrategy implements PhoneNumberStrategy {

	@Override
	public boolean validateNumber(String number) {
		return number != null && number.matches("\\d{10}");
	}

	@Override
	public String getCountryName() {
		return "North America";
	}
}
