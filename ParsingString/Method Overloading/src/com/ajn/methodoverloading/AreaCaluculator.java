package com.ajn.methodoverloading;

public class AreaCaluculator {

	
	public static double area(double r) {
		if(r<0) {
			return -1;
		}
		
		return Math.PI*r*r;
	}
	
	public static double area(double x,double y) {
		if(x<0 || y<0) {
			return -1;
		}
		
		return x*y;
	}
}
