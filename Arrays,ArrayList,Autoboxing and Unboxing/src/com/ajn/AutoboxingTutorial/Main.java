package com.ajn.AutoboxingTutorial;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numArrayList = new ArrayList<Integer>();
		ArrayList<Character> charac = new ArrayList<Character>(); 		
		for (int i = 0; i < 10; i++) {
			numArrayList.add(Integer.valueOf(i));		//Autoboxing
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numArrayList.get(i).intValue()); //Unboxing
		}
		
		
		Integer num2 = Integer.valueOf(45); // OR -  Integer num2 = 45;
		
		int num3 = num2.intValue(); // OR - int num3 = num2;
		
		
		ArrayList<Double> doubleval = new ArrayList<Double>();
		
		for(double i=0.0 ; i<=10.0 ; i +=0.5) {
			doubleval.add(Double.valueOf(i));
		}
		
		for (int i = 0; i <doubleval.size(); i++) {
			System.out.println(i+" --> "+doubleval.get(i).doubleValue());
		}
	}

}






