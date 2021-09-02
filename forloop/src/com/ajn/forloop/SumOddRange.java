package com.ajn.forloop;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%2d %4f \n",6 ,4.5);
System.out.printf("%d",sumOdd(5, 5));
	}

	public static boolean isOdd(int num) {
		if (num < 0) {
			return false;
		} else {

			if ((num % 2 != 0) || (num == 1)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static int sumOdd(int st, int nd) {
		int sum = 0;
		if ((st > 0) && (nd > 0) && (nd >= st)) {
			for (int i = st; i <= nd; i++) {
				if (isOdd(i)) {
					sum += i;
				}
			}

		} else {
			return -1;
		}
		return sum;
	}

}
