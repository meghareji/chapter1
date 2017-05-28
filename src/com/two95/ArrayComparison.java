package com.two95;

public class ArrayComparison {

	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		double[] secondList = { 1.1, 2.2, 1.2, 5.6, 1.1, 1.2, 4.5, 7.6, 3.4, 8.9, 9.8, 1.0 };
		double max1 = 0;
		double max2 = 0;
		double min = 100;
		double min2 = 100;
		double sum = 0;
		for (int i = 0; i < myList.length; i++) {
			if ((myList[i] > max1)) {
				max1 = myList[i];
			} else {
				min = myList[i];

			}
			sum += myList[i];

		}

		for (int j = 0; j < secondList.length; j++) {
			sum += secondList[j];
			if (secondList[j] > max2) {
				max2 = secondList[j];
			} else {
				min2 = secondList[j];
			}

		}
		if (max1 > max2) {
			System.out.println("max=" + max1);
		} else
			System.out.println("max=" + max2);
		System.out.println("Sum = " + sum);
		if (min < min2)
			System.out.println("min = " + min);
		else
			System.out.println("min =" + min2);
	}
}
