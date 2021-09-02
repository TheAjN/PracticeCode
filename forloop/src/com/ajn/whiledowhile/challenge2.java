package com.ajn.whiledowhile;

public class challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generted method stub
				System.out.println(sumDigits(125));
				System.out.println(sumDigits(-125));
				System.out.println(sumDigits(4));
				System.out.println(sumDigits(32123));
	}

	
	
	public static int sumDigits(int num) {
		
		if(num>=10) {
			 int sum=0;
			while(num>0){
				sum+=(num%10);
				num/=10;
			}
			return sum;
		}else {
			return -1;
		}
			
	}
}
