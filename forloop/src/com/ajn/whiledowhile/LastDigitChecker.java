package com.ajn.whiledowhile;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSameLastDigit(1, 99, 12));
	}
	
	public static boolean hasSameLastDigit(int n1,int n2, int n3) {
		
		if(isValid(n1) && isValid(n2) && isValid(n3)) {
		
			if((n1%10)==(n2%10)||(n2%10)==(n3%10)||(n1%10)==(n3%10)) {
				return true;
			}else {
				return false;
			}	
		}else {
			return false;
		}
	}
	
	public static boolean isValid(int num) {
		if(num<10 || num>1000) {
			return false;
		}
		return true;
	}
	
}
