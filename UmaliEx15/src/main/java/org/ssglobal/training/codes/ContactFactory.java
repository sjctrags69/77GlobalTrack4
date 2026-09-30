package org.ssglobal.training.codes;

public interface ContactFactory {
	Address createAddress(String address);
	PhoneNumber createPhoneNumber(String phoneNumber);
}
