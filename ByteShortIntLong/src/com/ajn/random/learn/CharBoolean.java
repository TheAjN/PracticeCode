package com.ajn.random.learn;

public class CharBoolean {
	public static void main(String[] args)
	{
		char d= 'd';
		char unico= '\u00BC';
		System.out.println(d + "\n" + unico);
		
		String mystring = "This is a sentence";
		System.out.println(mystring);
		mystring+= ", and also more ";
		System.out.println(mystring + "Literal sentence");
		mystring = mystring + '\u00a9';
		System.out.println(mystring);
		
		String numstr= "2323.533";
		numstr+= "3343.5566";
		System.out.println(numstr);
		
		double num=  50.323d;
		String numstr2 = "30";
		numstr2=numstr2 + num;
		System.out.println("The number is - " + numstr2);
	}
}
