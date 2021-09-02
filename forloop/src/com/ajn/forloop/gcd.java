package com.ajn.forloop;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor(12, 36));
	}

	public static int getGreatestCommonDivisor(int f, int s) {

		if (f < 10 || s < 10) {
			return -1;
		}

		int gcd = 1;
		for (int i = 1; i <= f && i <= s; i++) {

			if (f % i == 0 && s % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
}
