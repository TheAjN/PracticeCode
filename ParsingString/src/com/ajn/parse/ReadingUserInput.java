package com.ajn.parse;

import java.util.Scanner;



public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Age? - ");
		boolean hasNextInt = scanner.hasNextInt(); //checks whether the next input is an integer input
													//Since it returns boolean, we need to use if statement to check whether the input is valid or not 
//		System.out.println(hasNextInt); 

		if (hasNextInt) {
			int n = scanner.nextInt();
//			System.out.println("Another number just to test - " );
//			double d=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Your name? - ");
			String st = scanner.nextLine();

			if (n > 0 && n <= 100) {
				System.out.println(st + " is the persons name and the age is " + n);
			} else {
				System.out.println("Invalid Age");
			}

		}else {
			System.out.println("False Age input");
		}
	scanner.close();

	}

}
