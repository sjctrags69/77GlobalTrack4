package org.ssglobal.training.codes.itema.abstractfactory;

public class NorthAmericaContactFactory implements ContactFactory {
	private String street;
    private String city;
    private String state;
    private String postalCode;
    private String phone;
    
	public NorthAmericaContactFactory(String street, String city, String state, String postalCode, String phone) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.phone = phone;
	}

	@Override
	public Address createAddress() {
		return new NorthAmericaAddress(street, city, state, postalCode);
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new NorthAmericaPhoneNumber(phone);
	}
}
