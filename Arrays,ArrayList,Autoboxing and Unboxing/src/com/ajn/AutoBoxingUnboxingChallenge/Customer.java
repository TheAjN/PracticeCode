package com.ajn.AutoBoxingUnboxingChallenge;

import java.util.ArrayList;


public class Customer {

	private String name;
	private  ArrayList<Double> transactions; 
	
	
	public Customer(String name,double transaction) {
		this.name = name;
		transactions= new ArrayList<Double>();
		transactions.add(transaction);
	}
	
//	public Customer(String name, Double transaction) {
//		this.name= name;
//		transactions.add(transaction);
//	}
//	
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void addtransaction (Double transaction) {
		transactions.add(transaction);
		
		
	}
	public static Customer addCustomer(String name, Double transaction) {
		return new Customer(name,transaction);
	}
	
}
