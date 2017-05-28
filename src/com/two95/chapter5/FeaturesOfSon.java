package com.two95.chapter5;

public class FeaturesOfSon implements FeatureColor, FeatureDiabetic {
	public void SkinColorOfMother() {
		System.out.println("White complexion");
	}

	@Override
	public void FatherDiabetic() {
		System.out.println("Iam diabetic");

	}

	@Override
	public void SkinColorOfFather() {

	}

}
