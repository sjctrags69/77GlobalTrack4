package org.ssglobal.training.codes;

public class NorthAmericaContactFactory implements ContactFactory {
	@Override
	public Address createAddress(String address) {
		return new NorthAmericaAddress(address);
	}

	@Override
	public PhoneNumber createPhoneNumber(String phoneNumber) {
		return new NorthAmericaPhoneNumber(phoneNumber);
	}
}
