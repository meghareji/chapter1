package com.two95.CoreLibraries;

import java.util.ArrayList;
import java.util.List;

public class PhoneTest {

	public static void main(String[] args) {
		Phone iphone = new Phone("6s", "black", "700");
		Phone samsung = new Phone("s6", "black", "600");
		Phone nokia = new Phone("s8", "black", "500");
		PhoneAdvanced iphone7 = new PhoneAdvanced("7s", "white", "100");
		List<Phone> phone = new ArrayList<Phone>();
		phone.add(iphone);
		phone.add(samsung);
		phone.add(nokia);
		phone.add(iphone7);
		for (Phone details : phone) {
			details.cal();
		}
	}

}
