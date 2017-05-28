package com.two95.oop.car;

public class LoanCalculator {

		// TODO Auto-generated constructor stub
	
		static int creditScore;
		double annualIncome;
		static double approvedAmount;
		static void setCreditScore(int score) {
		// Store the credit score
		creditScore = score;
		}
		void setAnnualIncome(double income) {
		// Store the annual Income
		annualIncome = income;
		}
		double getApprovedAmount() {
		// Apply the conditions and determine the approved amount
		if (creditScore < 600 && annualIncome > 60000) {
		approvedAmount = 500;
		} else if (creditScore > 600 && annualIncome < 70000) {
		approvedAmount = 1000;
		} else {
		approvedAmount = 0.0;
		}
		return approvedAmount;
		}
		}
	


