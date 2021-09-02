package com.ajn.random.learn;

public class Challeng3 {

	public static void main(String[] args) {
	double a=20.00d;
	double b= 80.00d;
	double d=(a+b)*100d;
	System.out.println("My value total - " + d);
	double	c=d%40d;
	boolean truth= ((c==0)?true:false);
	
	System.out.println("Is the output zero - " + truth);
	
	if(!truth)
	{
		System.out.println("Got some remainder");
	}
	}

}
