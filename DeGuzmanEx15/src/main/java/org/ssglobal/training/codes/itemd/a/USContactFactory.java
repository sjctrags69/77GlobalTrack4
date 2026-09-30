package org.ssglobal.training.codes.itemd.a;

public class USContactFactory extends AbstractContactFactory{
	@Override
	public void createAddress() {
		USAddress address = new USAddress();
        address.getAddress();
	}

	@Override
	public void createPhoneNumber() {
		USPhoneNumber phoneNumber = new USPhoneNumber();
        phoneNumber.getPhoneNumber();
	}
}
