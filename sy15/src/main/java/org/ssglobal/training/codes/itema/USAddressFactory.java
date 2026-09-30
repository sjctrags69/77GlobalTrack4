package org.ssglobal.training.codes.itema;

public class USAddressFactory implements IAddressFactory {
	@Override
	public Address createAddress() { 
				return new USAddress(); }
	
	@Override
	public PhoneNumber createPhoneNumber() { 
				return new USPhoneNumber(); }
}
