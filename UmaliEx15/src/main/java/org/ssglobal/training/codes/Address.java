package org.ssglobal.training.codes;

public abstract class Address {
	protected String address;

	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract boolean isValid();
}
