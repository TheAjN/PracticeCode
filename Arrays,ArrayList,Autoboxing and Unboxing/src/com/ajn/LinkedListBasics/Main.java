package com.ajn.LinkedListBasics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer("Daniel", 453.11d);
		Customer cus2;
		cus2=cus;
		cus2.setBalance(3.1);
		System.out.println(cus.getBalance());
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		intlist.add(5);
		intlist.add(2);
		intlist.add(18);
		intlist.add(232);
		intlist.add(77);
		
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println("Value "+(i+1)+" = "+intlist.get(i));
		}
	
		intlist.add(1,3);
		
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println("Value "+(i+1)+" = "+intlist.get(i));
		}
		
		intlist.remove(4);
		
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println("Value "+(i+1)+" = "+intlist.get(i));
		}
		
		
	}
}
