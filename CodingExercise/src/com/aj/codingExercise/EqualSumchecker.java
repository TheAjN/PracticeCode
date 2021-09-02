package com.aj.codingExercise;

public class EqualSumchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(hasEqualSum(-1, 2, 3));
	}

	public static boolean hasEqualSum(int a, int b, int c) {
		
		boolean bool=((a+b)==c)?true:false;
		return bool;
	}
	
}
