package com.two95.chapter5;

public class FeatureTest {

	public static void main(String[] args) {
		System.out.println("Features of son");
	FeaturesOfSon fs = new FeaturesOfSon();
	fs.FatherDiabetic();
	fs.SkinColorOfMother();
	System.out.println("Features of daughter");
	FeaturesOfDaughter fd = new FeaturesOfDaughter();
	fd.MotherDance();
	fd.SkinColorOfFather();
	fd.HeightOfFather();
	}

}
