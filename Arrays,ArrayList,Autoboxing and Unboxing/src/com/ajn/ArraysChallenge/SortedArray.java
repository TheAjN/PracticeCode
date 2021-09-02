package com.ajn.ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.
	
	private static Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] getArray = getIntegers();

		printArray(sortIntegers(getArray));
	}

	
	public static int[] getIntegers() {

		int[] array;
		System.out.println("Enter the list of numbers = ");
		int num = scanner.nextInt();
		array = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Enter number for " + (i + 1) + " position = ");
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}

		return array;
	}

	
	public static int[] sortIntegers(int[] array) {

		int temp = 0;
		
		int[] sortedarray = Arrays.copyOf(array, array.length);
		
		for (int i = 0; i < sortedarray.length; i++) {
			for (int j = i; j < sortedarray.length; j++) {
				
				if (sortedarray[i] < sortedarray[j]) {
					temp = sortedarray[i];
					sortedarray[i] = sortedarray[j];
					sortedarray[j] = temp;
				}
			}
		}

		return sortedarray;
	}

	//Another way of Sorting way of sorting values in an array - 
	
//	public static int[] sortIntegers(int[] array) {
////      int[] sortedArray = new int[array.length];
////      for(int i=0; i<array.length; i++) {
////          sortedArray[i] = array[i];
////      }
//      int[] sortedArray = Arrays.copyOf(array, array.length);
//
//      boolean flag = true;
//      int temp;
//      while(flag) {
//          flag = false;
//          // element 0     160
//          // element 1     50
//          // element 2     40
//
//          for(int i=0; i<sortedArray.length-1; i++) {
//              if(sortedArray[i] < sortedArray[i+1]) {
//                  temp = sortedArray[i];
//                  sortedArray[i] = sortedArray[i+1];
//                  sortedArray[i+1] = temp;
//                  flag = true;
//              }
//          }
//      }
//
//      return sortedArray;
//  }

	
	public static void printArray(int[] array) {
		System.out.println("Values in Descending order = ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Position " + (i+i) + " of value " + array[i]);
		}
	}
	
	
	
}
