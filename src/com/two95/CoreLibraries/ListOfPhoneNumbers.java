package com.two95.CoreLibraries;

import java.util.ArrayList;

public class ListOfPhoneNumbers {

	public static void main(String[] args) {
		ArrayList<String> PhoneNumbers = new ArrayList<String>();
		PhoneNumbers.add("Megha:212-112-1819");
		PhoneNumbers.add("Sneha:232-112-1819");
		PhoneNumbers.add("Neha:212-412-1819");
		PhoneNumbers.add("Anna:212-112-179");
		for (String PhoneBook : PhoneNumbers) {
			System.out.println(PhoneBook);
		}
	}

}
