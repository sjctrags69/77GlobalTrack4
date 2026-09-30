package org.ssglobal.training.codes.itema.abstractfactory;

public interface ContactFactory {
	Address createAddress();
	PhoneNumber createPhoneNumber();
}
