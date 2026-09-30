package org.ssglobal.training.codes;

public class NorthAmericaAddress extends Address {
	public NorthAmericaAddress(String address) {
		super(address);
	}

	@Override
	public boolean isValid() {
		return false;
	}
}
