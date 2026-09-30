package org.ssglobal.training.codes.itema;

class DutchAddress extends Address {
	@Override
	public String getCountry() { 
			return "Netherlands"; }
	
	@Override
	protected boolean isValidPostalCode(String postalCode) { 
			return true; }
}