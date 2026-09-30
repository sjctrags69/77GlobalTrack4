package org.ssglobal.training.codes.itema;

class USPhoneNumber extends PhoneNumber {
	@Override
	public String getCountryCode() { 
			return "1"; }
	
	@Override
	protected boolean isValidNumber(String phoneNumber) {
			return true; }
}