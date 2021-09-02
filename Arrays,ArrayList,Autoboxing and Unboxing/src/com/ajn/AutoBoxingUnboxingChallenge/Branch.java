package com.ajn.AutoBoxingUnboxingChallenge;

import java.util.ArrayList;

public class Branch {

	private String branchname;
	private ArrayList<Customer> customers;

	public Branch(String branchname) {
		this.branchname = branchname;
		customers = new ArrayList<Customer>();
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	
	
	public String getBranchname() {
		return branchname;
	}

	public boolean addNewCustomer(String name, double transaction) {
		if(findCustomer(name)<0) {
		
			this.customers.add(Customer.addCustomer(name, transaction));
			return true;
		}
		
		return false;
	}

	public boolean addCustomer(Customer customer) {
		
		if(findCustomer(customer)<0) {
			customers.add(customer);
			return true;
		}
		
		return false;
	}
	public boolean addTransaction(Customer customer, Double transaction) {

		if(findCustomer(customer)<0) {
			System.out.println("the customer "+customer.getName()+" does not exist.");
			return false;
		}
		
		customer.getTransactions().add(transaction);
		
		return true;
	}

	public boolean addTransaction(String name, Double transaction) {

//		for (int i = 0; i < customers.size(); i++) {
//			if (name.equals(customers.get(i).getName())) {
			if(findCustomer(name)>=0) {
	//			customers.get(findCustomer(name)).getTransactions().add(transaction);
				customers.get(findCustomer(name)).addtransaction(transaction);
				return true;
			}
				return false;
		}
//		}
//	}
	
	private int findCustomer(String name) {
		for (int i = 0; i < this.customers.size(); i++) {
			if(this.customers.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int findCustomer(Customer customer) {
		return customers.indexOf(customer);
	}
}
