package org.ssglobal.training.codes.itemd.a;

public class NetherlandsContactFactory extends AbstractContactFactory{
	@Override
	public void createAddress() {
		NetherlandsAddress address = new NetherlandsAddress();
        address.getAddress();
	}

	@Override
	public void createPhoneNumber() {
		NetherlandsPhoneNumber phoneNumber = new NetherlandsPhoneNumber();
        phoneNumber.getPhoneNumber();
	}
}
