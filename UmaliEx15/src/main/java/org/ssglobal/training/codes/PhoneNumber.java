package org.ssglobal.training.codes;

public abstract class PhoneNumber {
	protected String phoneNumber;

	public PhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public abstract boolean isValid();
}
