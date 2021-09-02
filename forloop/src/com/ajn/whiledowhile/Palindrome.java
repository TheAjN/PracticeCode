package com.ajn.whiledowhile;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12321));
	}

	
	
	public static boolean isPalindrome(int num) {
		num=Math.abs(num);
		int temp = num;
		int rev=0;
		while(num>0) {
			rev+=num%10;
			rev*=10;
			num/=10;
		}
		rev/=10;
		if(rev==temp) {
			return true;
		}
		
		return false;
	}
}
