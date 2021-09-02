package com.ajn.parse;

import java.util.Scanner;

public class MinandMaxChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		boolean hasint = true; 
			//boolean first = true;
		System.out.println("Enter a number - ");
		while (hasint) {
			hasint = sc.hasNextInt();
			if (hasint) {
				System.out.println("Enter a number - ");
				
				int num = sc.nextInt();
				sc.nextLine();
				
				if (max <num ) {
//					if (min > num || first) {
//						min = num;
//						first=false;
//					}
					max = num;
				}
				if(num<min) {
					min=num;
				}

			} else {
				System.out.println("Invalid Input");
				System.out.println("Max - " + max + "\n" + "Min -  " + min);
				break;
			}
		}
		sc.close();
	}
}
