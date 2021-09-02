package com.ajn.random.learn;

public class keywords_and_Expression {

	public static void main(String[] args) {

		calif(false, 10, 40);
		int data3 = calif(true, 60, 80);
		cal(true, 10000, 8, 200);
		cal(true, 5000, 5, 100);
//		if (int1 < 5) {
//			System.out.println("less than 5");
//		} else if (int1 >= 5 && int1 < 10) {
//			System.out.println("Equals or Greater than 5");
//		} else {
//			System.out.println("Whatever");
//		}
//		
	}

	public static int calif(boolean truth, int int1, int data2) {
		if (truth) {
			data2 = int1 * data2;
			System.out.print("Fax Output  multi- ");
			return data2;
		} else {
			data2 = int1 + data2;
			System.out.println("Fax Output  add- " + data2);
			return data2;
		}
	}

	public static void cal(boolean gover, int madshii, int levelcomp, int bset) {

		if (gover) {
			int secondscore = madshii + (levelcomp * bset);
			System.out.println("secondscore - " + secondscore);
		}

	}
}