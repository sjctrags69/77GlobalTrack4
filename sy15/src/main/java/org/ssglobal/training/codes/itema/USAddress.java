package org.ssglobal.training.codes.itema;
 	
class USAddress extends Address {
	@Override
	public String getCountry() { return "USA"; }
	
	@Override
	protected boolean isValidPostalCode(String postalCode) { return true; }
}
