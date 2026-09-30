package org.ssglobal.training.codes.itemD.factory;

public class USPhoneNumber extends PhoneNumber {
	public USPhoneNumber(String number) {
		if (!validateNumber(number))
			throw new IllegalArgumentException("Invalid US phone number");
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
