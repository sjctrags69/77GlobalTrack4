package org.ssglobal.training.codes;

public class NetherlandsContactFactory implements ContactFactory {
	@Override
	public Address createAddress(String address) {
		return new NetherlandsAddress(address);
	}

	@Override
	public PhoneNumber createPhoneNumber(String phoneNumber) {
		return new NetherlandsPhoneNumber(phoneNumber);
	}
}
