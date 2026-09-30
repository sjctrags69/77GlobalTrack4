package org.ssglobal.training.codes.itema.abstractfactory;

public class NorthAmericaPhoneNumber implements PhoneNumber {
	private String phoneNumber;

	public NorthAmericaPhoneNumber(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getPhoneNumberDetails() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public Boolean isValidPhoneNumber() {
		return phoneNumber != null;
	}
}
