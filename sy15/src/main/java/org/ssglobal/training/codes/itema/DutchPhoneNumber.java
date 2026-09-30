package org.ssglobal.training.codes.itema;

class DutchPhoneNumber extends PhoneNumber {
	@Override
	public String getCountryCode() { 
			return "31"; }
	
	@Override
	protected boolean isValidNumber(String phoneNumber) { 
			return true; }
}