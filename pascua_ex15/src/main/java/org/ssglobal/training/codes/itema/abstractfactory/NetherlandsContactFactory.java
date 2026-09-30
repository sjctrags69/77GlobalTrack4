package org.ssglobal.training.codes.itema.abstractfactory;

public class NetherlandsContactFactory implements ContactFactory {
	private String street;
    private String city;
    private String postalCode;
    private String phone;
    
	public NetherlandsContactFactory(String street, String city, String postalCode, String phone) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
	}

	@Override
	public Address createAddress() {
		return new NetherlandsAddress(street, city, postalCode);
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new NetherlandsPhoneNumber(phone);
	}
    
    
    
}
