package com.ajn.forloop;

public class miniChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 8; i > 1; i--) {
			System.out.println("Calculated Interest of " + i + "% - " 
		+calculateInterest(10000.0, (double)i));
		}
	}

	public static double calculateInterest(double amount, double interestr) {
		return amount*interestr/100;
	}
}
