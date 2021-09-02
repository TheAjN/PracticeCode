package com.ajn.AutoBoxingUnboxingChallenge;

import java.util.ArrayList;


public class Bank {

	private String Bankname;
	private ArrayList<Branch> branches; 

	
	public Bank(String Bankname) {
		this.Bankname = Bankname;
		this.branches = new ArrayList<Branch>();
	}

	public Bank(ArrayList<Branch> branches) {
		this.branches = branches;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
//	public void printBranchCustomers(Branch branch) {
//		for(int i = 0; i<branches.size();i++) {
//			if(branches.get(i).equals(branch)) {
//				System.out.println("List of customer names in the branch");
//				for (int j = 0; j < branch.getCustomers().size(); j++) {
//					System.out.println("Customer name - "+branch.getCustomers().get(j).getName());
//				}
//				
//			}
//		}
//	}
//	
	
	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch!= null) {
			System.out.println("Customer details for branch "+ branch.getBranchname());
			
			ArrayList<Customer> branchcustomers= branch.getCustomers();
			
			for (int i = 0; i < branchcustomers.size(); i++) {
				System.out.println("Customer: " +branchcustomers.get(i).getName() +" ["+i+"]");
				if(showTransactions) {
					ArrayList<Double> transactions = branchcustomers.get(i).getTransactions();
					for (int j = 0; j < transactions.size(); j++) {			
						System.out.println("["+(j+1)+"]"+"Amount "+transactions.get(j));
					}		
				}
			}
			return true;
		}else {
			return false;
		}
	
	}

	public boolean addBranch(String branchname) {

		if (findBranchName(branchname) < 0) {
		 branches.add(new Branch(branchname));
		}
		return false;
	}

//	public boolean addCustomerToTheBranch(String name, double transaction) {
//
//		for (int i = 0; i < branches.size(); i++) {
//			if (findBranchName(name) > 0) {
//				return branches.get(i).addNewCustomer(name, transaction);
//			}
//		}
//		return false;
//	}

	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		
		if(findBranch(branchName)!= null) {
			return findBranch(branchName).addNewCustomer(customerName, initialAmount);
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String Branchname,String customerName, double transaction) {
		
	//	int pos = findBranchName(Branchname);
		
		Branch branch = findBranch(Branchname);
	if (branch !=null) {
//			return branches.get(findBranchName(Branchname)).getCustomers().get(findCustomerName(customerName)).getTransactions()
//					.add(transaction);
			
			return branch.addTransaction(customerName, transaction);
			
		}
		return false;
	}

//	private int findCustomerName(String name) {
//		for (int i = 0; i < branches.size(); i++) {
//			for (int j = 0; j < branches.get(i).getCustomers().size(); j++) {
//				if (name.equals(branches.get(i).getCustomers().get(j).getName())) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}

//	private int findBranch(Customer customer) {
//
//		for (int i = 0; i < branches.size(); i++) {
//			for (int j = 0; j < branches.get(i).getCustomers().size(); j++) {
//				if (customer.equals(branches.get(i).getCustomers().get(j))) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}

//	private int findBranch(Branch branch) {
//		return branches.indexOf(branch);
//	}
	
	private int findBranchName(String BranchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			String tempString = branches.get(i).getBranchname();
			if(tempString.equals(BranchName)) {
				return branches.indexOf(tempString);
			}
		}
		
		return -1;
	}
	
	private Branch findBranch(String BranchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			Branch checkedBranch = branches.get(i);
			if(checkedBranch.getBranchname().equals(BranchName)) {
				return checkedBranch;
			}
		}	
		return null;	
	}
}
