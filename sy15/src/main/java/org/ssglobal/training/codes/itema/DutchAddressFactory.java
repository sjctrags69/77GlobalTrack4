package org.ssglobal.training.codes.itema;

public class DutchAddressFactory implements IAddressFactory {
	@Override
	public Address createAddress() {
			return new DutchAddress(); }
	
	@Override
	public PhoneNumber createPhoneNumber() {
			return new DutchPhoneNumber(); }
}
