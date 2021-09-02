package com.aj.codingExercise;

public class LargestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(45));
	}

	public static int getLargestPrime(int num) {
		
		int pr=2;
		if(num<2) {
			return -1;
		}
		
		for(int i =2; i<=num;i++) {
			
			if( num%i == 0) {
				num/=i;
				System.out.println(num);
				pr=i;
				i--;		
			
		}
		}
		return pr;
	}
}