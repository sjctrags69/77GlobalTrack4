package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.Address;
import org.ssglobal.training.codes.NetherlandsAddressStrategy;
import org.ssglobal.training.codes.NetherlandsPhoneNumberStrategy;
import org.ssglobal.training.codes.NorthAmericaAddressStrategy;
import org.ssglobal.training.codes.NorthAmericaPhoneNumberStrategy;
import org.ssglobal.training.codes.PhoneNumber;

public class TestStrategy {

	@Test
	public void testNorthAmericaContact() {
		Address address = new Address("12 Maple Street", "Toronto", "12345", new NorthAmericaAddressStrategy());
		PhoneNumber phone = new PhoneNumber("4165551234", new NorthAmericaPhoneNumberStrategy());
		address.showAddress();
		phone.showPhoneNumber();
	}

	@Test
	public void testNetherlandsContact() {
		Address address = new Address("Damrak 1", "Amsterdam", "1012 LG", new NetherlandsAddressStrategy());
		PhoneNumber phone = new PhoneNumber("0201234567", new NetherlandsPhoneNumberStrategy());
		address.showAddress();
		phone.showPhoneNumber();
	}

	@Test
	public void testInvalidFormats() {
		try {
			new Address("Damrak 1", "Amsterdam", "1012LG", new NetherlandsAddressStrategy());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			new PhoneNumber("416555123", new NorthAmericaPhoneNumberStrategy());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void testChangeCountryRuntime() {
		Address address = new Address("12 Maple Street", "Toronto", "12345", new NorthAmericaAddressStrategy());
		PhoneNumber phone = new PhoneNumber("4165551234", new NorthAmericaPhoneNumberStrategy());
		address.setAddressStrategy(new NetherlandsAddressStrategy());
		address.setPostalCode("1012 LG");
		phone.setPhoneNumberStrategy(new NetherlandsPhoneNumberStrategy());
		phone.setNumber("0201234567");
		address.showAddress();
		phone.showPhoneNumber();
	}
}
