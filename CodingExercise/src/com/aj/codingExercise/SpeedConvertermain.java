package com.aj.codingExercise;

import java.util.Scanner;

public class SpeedConvertermain {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the kilometer/hour - ");
		double x=s.nextDouble();
		speedconverter.printConversion(x);
		
	}

}
