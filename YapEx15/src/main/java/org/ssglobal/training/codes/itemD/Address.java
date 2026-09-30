package org.ssglobal.training.codes.itemD;

public abstract class Address {
	protected String street;
    protected String city;
    protected String postalCode;

    public abstract boolean validatePostalCode(String postalCode);
    public abstract String display();
}
