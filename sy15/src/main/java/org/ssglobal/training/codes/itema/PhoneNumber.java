package org.ssglobal.training.codes.itema;

public abstract class PhoneNumber {
	private String phoneNumber;

	public abstract String getCountryCode();
	protected abstract boolean isValidNumber(String phoneNumber);
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
