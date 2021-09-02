package com.ajn.whiledowhile;

public class FirstandLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(sumFirstAndLastDigit(1235));
	}

	public static int sumFirstAndLastDigit(int num) {
		
		if(num<0) {
			return -1;
		}
		
		int sum = 0;
		int temp=num;
		sum+=temp%10;
		while(temp>0) {
			if(temp>9) {
				temp/=10;
				if(temp<10) {
					sum+=temp;
					return sum;
				}	
			}else {
				sum+=temp;
				break;
			}
		}
		return sum;
		
	}
	
	
}
