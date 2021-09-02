package com.aj.codingExercise;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.123));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		x*=1000;
		y*=1000;
		
		x= (long) x;
		y= (long) y;
		
		if(x==y) {
			return true;
		}else {
			return false;
		}
	}
	
}
