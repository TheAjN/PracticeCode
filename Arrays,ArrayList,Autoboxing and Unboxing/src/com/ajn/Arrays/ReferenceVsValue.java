package com.ajn.Arrays;

import java.util.Arrays;



public class ReferenceVsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = new int[5];
		int[] b=a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		b[0] =4;
		System.out.println("--------------------");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println("--------------------");
		
		modifyArray(a);
		
		System.out.println("--------------------");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println("--------------------");
		
		b= new int[] {6,84,4,44,2};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

	private static void modifyArray(int[] array) {
		
		array[0]= 9;
		System.out.println(Arrays.toString(array));
		 
		array = new int[] {4,3,2,6,8}; //here, array is reference to a new array memory
										// This is called de-referencing
		
		System.out.println(Arrays.toString(array));
	}
}
