package com.ajn.whiledowhile;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(-2));
	}
	
	public static int getEvenDigitSum(int num) {
		
		if(num<0) {
			return -1;
		}
		int sum = 0;
		int checkd=0;
		while(num>0) {
			checkd+=num%10;
			if(num%2==0) {
				sum+=checkd;
			}
			num/=10;
			checkd=0;
		}
		return sum;
		
	}

}
