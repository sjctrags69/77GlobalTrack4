package org.ssglobal.training.codes;

public class NorthAmericaPhoneNumber extends PhoneNumber {
	public NorthAmericaPhoneNumber(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	public boolean isValid() {
		return false;
	}
}
