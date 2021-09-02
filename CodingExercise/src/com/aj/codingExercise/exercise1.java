package com.aj.codingExercise;

public class exercise1 {

	public static void main(String[] args) {
		checknumber(0);
		checknumber(3);
		checknumber(-2323);
	}

	public static void checknumber(int num) {
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("zero");
		}
	}
}
