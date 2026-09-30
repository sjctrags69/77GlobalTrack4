package org.ssglobal.training.codes;

public class PhoneNumber {
	private String number;
	private PhoneNumberStrategy phoneNumberStrategy;

	public PhoneNumber(String number, PhoneNumberStrategy phoneNumberStrategy) {
		this.phoneNumberStrategy = phoneNumberStrategy;
		setNumber(number);
	}

	public void setNumber(String number) {
		if (!phoneNumberStrategy.validateNumber(number)) {
			throw new IllegalArgumentException(String.format("Phone number %s does not follow the %s format.",
					number, phoneNumberStrategy.getCountryName()));
		}
		this.number = number;
	}

	public void setPhoneNumberStrategy(PhoneNumberStrategy phoneNumberStrategy) {
		this.phoneNumberStrategy = phoneNumberStrategy;
	}

	public PhoneNumberStrategy getPhoneNumberStrategy() {
		return phoneNumberStrategy;
	}

	public String getNumber() {
		return number;
	}

	public void showPhoneNumber() {
		System.out.printf("%s (%s)\n", number, phoneNumberStrategy.getCountryName());
	}
}
