package com.ajn.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {3,4,5,6,7,8,9};
		
		reverse(array);
	}

	public static void reverse(int[] array) {
		
		int temp= 0;
		int n=array.length-1;
		System.out.println("Array before swap = " + Arrays.toString(array));
		for(int i=0, j=n; (i<j || i==j ); i++,j--) {
			temp = array[i];
			array[i]= array[j];
			array[j]= temp;
		}
		
		System.out.println("Array after swap = " + Arrays.toString(array));
	}
	
	//another way of doing reverse array
	/*
	   private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
	 */
}
