package com.ajn.methodoverloading;

public class minutetoyearsanddayscalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(525600);
	}

	public static void printYearsAndDays(long min) {
		if (min < 0) {
			System.out.println("Invalid Value");
		} else {

			long d = (min / 60) / 24;
			long y ;
			if(d>=365) {
				y = d / 365;
				d%=365;
			}else {
				y=0;
			}

			System.out.println(min + " min" + " = " + y + " y and " + d + " d");

		}
	}
}
