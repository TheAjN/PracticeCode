package com.aj.codingExercise;

public class speedconverter {


	public static double toMilesPerHour(double kmh) {

		if (kmh < 0) {
			return -1;
		} else {
			
			return Math.round(kmh/1.609);
		}
	}
	
	//0.6213712
	
	public static void printConversion(double kmh) {
		if(kmh>0) {
		System.out.println(kmh + " km/h = " + toMilesPerHour(kmh) + " mi/h");
		}else {
			System.out.println("Invalid Value");
		}
	}
}


