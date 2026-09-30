package org.ssglobal.training.codes.itemD.factory;

public abstract class PhoneNumber {
	protected String number;

	public abstract boolean validateNumber(String number);

	public abstract String display();
}
