package org.ssglobal.training.codes;

public class NetherlandsPhoneNumberStrategy implements PhoneNumberStrategy {

	@Override
	public boolean validateNumber(String number) {
		return number != null && number.matches("0\\d{9}");
	}

	@Override
	public String getCountryName() {
		return "Netherlands";
	}
}
