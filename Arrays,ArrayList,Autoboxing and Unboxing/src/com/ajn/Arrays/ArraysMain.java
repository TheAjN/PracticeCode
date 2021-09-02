package com.ajn.Arrays;

import java.util.Scanner;

public class ArraysMain {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] intarray = new int[10];
//	
//		intarray[5] = 50;
//		
//		int[] int2array = {3,5,2,1,5,5,2,21,4,1};
//		
//		
//		System.out.println(intarray[5]);
//		
//		double doublearray[] = new double[5];
//		
//		for(int i=0; i < doublearray.length;i++) {
//			 doublearray[i] = i+(i*4); 
//		}
//		printArray(doublearray); 
		
		
		int[] EnterArray = getArray(5);
		
		printArray(EnterArray);
		System.out.println("Average of the Entered values = "+ getAverage(EnterArray));
		
	}

	
	public static int[] getArray(int num) {
		int[] values = new int[num];
		
		System.out.println("Enter " + num + " values.\r"); // "\r" is used for keeping the 
															//cursor in the next line 
															//for inputing
		for(int i=0; i < values.length;i++) {
			 values[i] = scanner.nextInt();
			 scanner.nextLine(); 
		}
		return values;
	}
	
	public static double getAverage(int[] array) {
		
		double avg=0;
		for(int i =0 ; i< array.length;i++) {
			avg+=array[i];
		}
		
		return (double)(avg/array.length);
	}
	
	
	public static void printArray(double[] array) {
		for(int i=0; i < array.length;i++) {
			System.out.println("Position " + i + " of value "+ array[i]);
		}
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i < array.length;i++) {
			System.out.println("Position " + i + " of value "+ array[i]);
		}
	}
}
