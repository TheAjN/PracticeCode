package com.ajn.AutoBoxingUnboxingChallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("HDFC Bank");
		
	if(bank.addBranch("Karkala")) {
		System.out.println("Karkala branch created");
	}
	
		bank.addCustomer("Karkala", "Jack", 32.3);
		bank.addCustomer("Karkala", "Maxon", 678.3);
		bank.addCustomer("Karkala", "Nasus", 1232.3);
		
		bank.addBranch("Bangalore");
		bank.addCustomer("Bangalore", "Lux", 4546.9);
		bank.addCustomer("Bangalore", "Jax", 915.5);
		bank.addCustomer("Bangalore", "Fizz", 736.4);
		
		bank.addCustomerTransaction("Karkala", "Jack", 765.6);
		bank.addCustomerTransaction("Karkala", "Jack", 75.6);
		bank.addCustomerTransaction("Karkala", "Maxon", 86.2);
		bank.addCustomerTransaction("Karkala", "Nasus", 87.4);
		
		bank.listCustomers("Karkala", true);
		bank.listCustomers("Bangalore", true);
		
		bank.addBranch("Delhi");
		if (!bank.addCustomer("Delhi", "Lucian", 6.4)) {
			System.out.println("Not added sorry mate!");
		}
		
		
		if(!bank.addBranch("Karkala")) {
			System.out.println("Karkala already exists");
		}
		
		if(!bank.addCustomerTransaction("Karkala", "Daniel", 947.1)) {
			System.out.println("Daniel does not exsit in Karkala branchX");
		}
		
		if(!bank.addCustomer("Karkala", "Nasus", 1232.3)) {
			System.out.println("Nasus is already exists");
		}
	}

}
