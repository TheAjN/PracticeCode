package com.ajn.methodoverloading;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1= calcu(20, "Jake");
		int v2 = calcu(30);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(calcu());
		calcu(1232L);
	}

	public static int calcu(int sc, String name) {
		
		System.out.println(sc+" is the score and "+name+" is the name. ");
	
		return sc*100;
	}
	
	public static int calcu( int sc ) {
	
		System.out.println("output is only score - "+ sc );
		return sc*10;
	}
	
	public static int calcu() {
		System.out.println("no score no output");
		return 5;
	}
	
	public static void calcu(long a) {
		
		System.out.println(" Long output is only score - "+ a );
	}
}

