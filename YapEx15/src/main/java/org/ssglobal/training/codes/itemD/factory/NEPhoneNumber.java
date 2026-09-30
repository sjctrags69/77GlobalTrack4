package org.ssglobal.training.codes.itemD.factory;

public class NEPhoneNumber extends PhoneNumber {
	public NEPhoneNumber(String number) {
		if (!validateNumber(number))
			throw new IllegalArgumentException("Invalid NL phone number");
		this.number = number;
	}

	@Override
	public boolean validateNumber(String number) {
		return true;
	}

	@Override
	public String display() {
		return null;
	}
}
