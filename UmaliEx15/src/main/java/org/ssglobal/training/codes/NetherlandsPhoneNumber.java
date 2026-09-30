package org.ssglobal.training.codes;

public class NetherlandsPhoneNumber extends PhoneNumber {
	public NetherlandsPhoneNumber(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	public boolean isValid() {
		return false;
	}
}
