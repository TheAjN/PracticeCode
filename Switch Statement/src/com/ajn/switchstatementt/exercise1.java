package com.ajn.switchstatementt;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'D';

		switch (ch) {

		case 'A':
			System.out.println("A is found");
			break;

		case 'B':case 'C':case 'D':
			System.out.println(ch + " is found");
			break;

		default:
			System.out.println("No letters are found");
				
		}
		
		
		String m = "feB";
		
		switch(m.toUpperCase()) { 
		
		case "Jan":
			System.out.println("January");
			break;
		
		case "FEB":
			System.out.println("February");
			break;
		
		default:
			System.out.println("Other months");
		
		}
	}
}
