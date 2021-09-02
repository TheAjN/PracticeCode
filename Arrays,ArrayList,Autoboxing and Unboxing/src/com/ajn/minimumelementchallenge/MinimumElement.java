package com.ajn.minimumelementchallenge;

import java.util.Scanner;



public class MinimumElement {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Minimum value of the Integers is = " 
		+findMin(readElements(readInteger())));
		
	}
	
	private static int readInteger() {
		System.out.println("Enter the number of Integers = ");
		int count = scanner.nextInt();
		return count;
	}

	private static int[] readElements(int count) {
		
		int[] array = new int[count];
		for(int i= 0 ; i<count; i++) {
			System.out.println("Enter value for " +(i+1) + " position = ");
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		return array;
	}
	
	private static int findMin(int[] array) {
		
		int temp=Integer.MAX_VALUE; //This will always take the minimum value of the array
		for(int i=0; i< array.length;i++) {
			if(temp>array[i]) {
				temp= array[i];
			}
		}
		return temp;
	}
}
