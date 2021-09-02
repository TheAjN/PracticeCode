package com.ajn.parse;


public class ParseStringtoIntetc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "7854.56";
		System.out.println(str);
//		int num = Integer.parseInt(str);
		double num2= Double.parseDouble(str);
	
//		System.out.println(num);
		
		System.out.println(num2);
		
		str+=5.34;
		System.out.println(str);
//		num+=5;
//		System.out.println(num);
		
		num2+=5.34;
		System.out.println(num2);
		
	}

}
