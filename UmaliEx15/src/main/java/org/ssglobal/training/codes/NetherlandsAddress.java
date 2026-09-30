package org.ssglobal.training.codes;

public class NetherlandsAddress extends Address {
	public NetherlandsAddress(String address) {
		super(address);
	}

	@Override
	public boolean isValid() {
		return false;
	}
}
