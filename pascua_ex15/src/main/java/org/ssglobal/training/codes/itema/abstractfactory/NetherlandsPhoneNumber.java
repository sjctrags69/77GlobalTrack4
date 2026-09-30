package org.ssglobal.training.codes.itema.abstractfactory;

public class NetherlandsPhoneNumber implements PhoneNumber {
	private String phoneNumber;

	public NetherlandsPhoneNumber(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getPhoneNumberDetails() {
		return phoneNumber;
	}

	@Override
	public Boolean isValidPhoneNumber() {
		return phoneNumber != null;
	}
}
