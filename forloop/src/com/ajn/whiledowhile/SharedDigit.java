package com.ajn.whiledowhile;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(12, 13));
	}

	
	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1<10 || num1>99 || num2<10 || num2>99) {
			return false;
		}else {
			
			int check1=0,check2=0,temp2;
	
			while(num1>0) {
				check1+=num1%10;
				temp2=num2;
				while(temp2>0) {
					check2+=temp2%10;
					if(check1==check2) {
						return true;
					}
						temp2/=10;
						check2=0;
				}
				num1/=10;
				check1=0;
			}
			return false;	
		}
			
	}
}
