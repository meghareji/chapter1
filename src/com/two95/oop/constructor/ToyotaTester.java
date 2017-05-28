package com.two95.oop.constructor;

public class ToyotaTester {

	public static void main(String[] args) {
		ToyotaCorolla tc = new ToyotaCorolla();
		double price = tc.drive(1000);
		System.out.println("price of toyota corolla is "+ price);

		ToyotaCamry tca = new ToyotaCamry();
		price = tca.drive(2000);
		System.out.println("price of toyota corolla is "+ price);
		price=tca.driveFast(1500);
		System.out.println("price of toyota camry is "+ price);
		
		
		ToyotaAvalon ta = new ToyotaAvalon();
		price = ta.driveFaster(3000);
		System.out.println("price of toyota avalon is "+ price);
		price = ta.driveFast(3000);
		System.out.println("price of toyota camry is "+ price);
		price = ta.drive(3000);
		System.out.println("price of toyota corolla is "+ price);
	}

}
