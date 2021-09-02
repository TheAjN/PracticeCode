package com.ajn.OOP.FinalChallenge.BillsBurges;


public class HealthyBurger extends Hamburger{

	private double cucumber;
	
	private double onion ;
	

	
	public HealthyBurger(String name, String meat, double price) {
		super(name, "brown rye", price);
		// TODO Auto-generated constructor stub
	}

//	public double addCucumber() {
//		System.out.println("Cucumber is added ");
//		return getBasePrice() + 1;
//	}
//	
//	public double addOnion() {
//		System.out.println("Onion is added");
//		
//		return getBasePrice() + 0.5;
//	}
	
	
	public double addCucumber() {
	cucumber=1;
	return cucumber;
		
	}
	
	public double addOnion() {
		
		onion=0.5d;
		return onion;
	}
	

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
		double maintotal =getBasePrice();
		System.out.println("Base price = " + getBasePrice());
		
		if(cucumber!=0) {
			System.out.println("Cost of addtional Cucumber = " + cucumber);
			maintotal+=cucumber;
		}
		
		if(onion!=0) {
			System.out.println("Cost of addtional Onion = " + onion);
			maintotal+=onion;
		}
		
		
		super.totalPrice(maintotal);
	}

	/*ANOTHER MEHOD FOR
	 * totalPrice(){
	  double maintotal = super.totalPrice(); (if the return type of totalPrice() in hamburger class is double)
	  System.out.println("Base price = " + getBasePrice());
		
		if(cucumber!=0) {
			System.out.println("Cost of addtional Cucumber = " + cucumber);
			maintotal+=cucumber;
		}
		
		if(onion!=0) {
			System.out.println("Cost of addtional Onion = " + onion);
			maintotal+=onion;
		}
		 
	 * */

	
}
