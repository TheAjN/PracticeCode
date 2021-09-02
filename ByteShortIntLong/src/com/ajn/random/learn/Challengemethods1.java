package com.ajn.random.learn;

public class Challengemethods1 {

	public static void displayHighScorePosition(String name, int pos) {

		System.out.println(name + " managed to get into the position " + pos + " on the High Score Table");
	}

	public static int Score(int score) {
//		if (score >= 1000) {
//			return 1;
//		} else if (score >= 500 
//				) {
//			return 2;
//		} else if (score >= 100) {
//			return 3;
//		} 
//		
//		return 4;
		int pos = 4;
		if (score >= 1000) {
			pos = 1;
		} else if (score >= 500) {
			pos = 2;
		} else if (score >= 100) {
			pos = 3;
		}

		return pos;
	}
}




