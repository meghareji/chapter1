package com.two95;

public class ArrayCardPlay {

	public static void main(String[] args) {
		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q" };
		String[] suites = { "Diamonds", "Hearts", "Spades", "Clubs" };
		for (String name : suites) {
			for (String value : values) {
				System.out.println("Number " + value + " of " + name);
			}
		}
	}

}
