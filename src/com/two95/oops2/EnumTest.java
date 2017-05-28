package com.two95.oops2;

public class EnumTest {
	Month month;

	public EnumTest(Month month) {
		this.month = month;
	}

	public void specialityOfMonth() {
		switch (month) {
		case JANUARY:
			System.out.println("Start of a new year");
			break;
		case FEBRUARY:
			System.out.println("Smallest montth of an year");
			break;
		case MARCH:
			System.out.println("exam time in india");
			break;
		case APRIL:
			System.out.println("my birth month");
			break;
		case MAY:
			System.out.println("Vacation time for schools in india");
			break;
		case JUNE:
			System.out.println("Rainy season");
			break;
		default :
			System.out.println("half of an year is completed");
			break;

		}

	}
	 public static void main(String[] args) {
	 EnumTest firstMonth=new EnumTest(Month.JANUARY);
	 firstMonth.specialityOfMonth();
	 EnumTest thirdMonth=new EnumTest(Month.MARCH);
	 thirdMonth.specialityOfMonth();
	 EnumTest fifthMonth=new EnumTest(Month.MAY);
	 fifthMonth.specialityOfMonth();
			 
}
}
