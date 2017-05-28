package com.two95.chapter5;

public class DriversTest {

	public static void main(String[] args) {
		DriversSearch search = new DriversSearch();
		DriverWithLearners learner =new DriverWithLearners();
		search.performSearch(learner);
		DriverWithLicense driver = new DriverWithLicense();
		search.performSearch(driver);
		DriverWithoutLicense student = new DriverWithoutLicense();
		search.performSearch(student);
	}

}
