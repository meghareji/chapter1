package com.two95;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		double max = 0;
		double sum = 0;
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);

			

			sum += myList[i];
			System.out.println("sum = " + sum);

			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("largest number is" + max);
	}

}
