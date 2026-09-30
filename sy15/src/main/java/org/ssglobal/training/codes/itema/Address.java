package org.ssglobal.training.codes.itema;

public abstract class Address {
	private String street;
	private String city;
	private String postalCode;

	public abstract String getCountry();
	protected abstract boolean isValidPostalCode(String postalCode);
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
