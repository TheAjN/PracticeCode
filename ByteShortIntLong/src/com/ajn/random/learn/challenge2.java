package com.ajn.random.learn;

import java.util.Scanner;

public class challenge2 {
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter pounds - ");
		double pound = s.nextDouble();
	double kg = pound*0.453592d;
	System.out.println("Kg - " + kg);
	s.close();
	}

}
