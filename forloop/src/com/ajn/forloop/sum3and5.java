package com.ajn.forloop;

public class sum3and5 {

	public static void main(String[] args) {
		
		int sum=0,count=0;;
		System.out.println("List of Numbers divisible by 3 and 5 -");
		for (int i=1; i<=1000;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
				sum+=i;
				count++;
			}
			if(count==5) {
				break;
			}
		}
		System.out.println("Sum of th numbers - " + sum);

	}

}
