package com.two95.oop.car;

public class LoanCAlculatorTest {

		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanCalculator.setCreditScore(650);
		LoanCalculator lc=new LoanCalculator();
		lc.setAnnualIncome(50000.00);
		// Get the results
		lc.getApprovedAmount();
		double amount =lc.getApprovedAmount();
		System.out.println("Approved Amount = $" + amount);
		}
		

	}


