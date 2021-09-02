package com.aj.codingExercise;

public class TeennumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean hasTeen(int a,int b, int c) {
		
		if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isTeen(int d) {
		
		if(d>=13 && d<=19)
			return true;
		else {
			return false;
		}
	}
	
	
}
