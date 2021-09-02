package com.aj.codingExercise;

import java.util.Scanner;


public class LeapYearCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the year - ");
		int x=s.nextInt();
		System.out.println("\n");
		System.out.println("Is "+ x + " a leap year - " + leapyear(x));
	}
	
	public static boolean leapyear(int y) {
		
		if(y>1 && y<9999) {
			if(y%4==0) {
				if(y%100==0) {
					if(y%400==0) {
						return true;
					}else {
						return false;
					}
				}else {
					return true;
				}
			}else {
				return false;
			}
			
		}else {
			return false;
		}
		
	}
}
