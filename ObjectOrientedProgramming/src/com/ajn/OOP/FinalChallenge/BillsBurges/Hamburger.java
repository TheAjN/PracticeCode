package com.ajn.OOP.FinalChallenge.BillsBurges;

public class Hamburger {

	private String name;
	private String rolltype;
	private String meat;
	private double price;
	private double tomato;
	private double lettuce;
	private double carrot;
	private double sauce; 


	
	public Hamburger(String name, String rolltype, double price) {
		this.name = name;
		this.rolltype = rolltype;
		this.meat = "Chicken";
		this.price = price;
		this.tomato=0;
		this.lettuce=0;
		this.carrot=0;
		this.sauce=0;
	}

	public double addTomato() {   // use parameters for these methods
		this.tomato=1;
		return tomato;
	}

	public double addLettuce() {
		this.lettuce=0.5;
		return lettuce;
	}

	public double addCarrot() {
		carrot=1.5;
		return carrot;
	}

	public double addSauce() {
		sauce=2.0;
		return sauce;
	}
	
	
//	public boolean addTomato() {
//		double totprice = this.price + tomato ;
//		System.out.println("Tomato added");
//		
//		if(totprice>getBasePrice()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	public boolean addLettuce() {
//		double totprice = this.price + lettuce ;
//		System.out.println("Lettuce added");
//		
//		if(totprice>getBasePrice()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	public boolean addCarrot() {
//		return true;
//	}
//	
//	public boolean addSauce() {
//		return true;
//	}
//	
	public double getBasePrice() {
		return this.price;
	}
	
	
	public void totalPrice() {
	 double maintotal=this.price;
		System.out.println("Base price = " + getBasePrice());
		
		if(tomato!=0) {
			System.out.println("Cost of addtional Tomato = " + tomato);
			maintotal+=tomato;
		}
		
		if(lettuce!=0) {
			System.out.println("Cost of addtional Lettuce = " + lettuce);
			maintotal+=lettuce;
		}
		

		if(carrot!=0) {
			System.out.println("Cost of addtional Carrot = " + carrot);
			maintotal+=carrot;
		}
		
		if(sauce!=0) {
			System.out.println("Cost of addtional Sauce = " + sauce);
			maintotal+=sauce;
		}
		
		System.out.println("Grand Total price = " + maintotal);
	}
		
	
	public void totalPrice(double maintotal) {
		System.out.println("Updated price = " + maintotal);
		
		if(tomato!=0) {
			System.out.println("Cost of addtional Tomato = " + tomato);
			maintotal+=tomato;
		}
		
		if(lettuce!=0) {
			System.out.println("Cost of addtional Lettuce = " + lettuce);
			maintotal+=lettuce;
		}
		

		if(carrot!=0) {
			System.out.println("Cost of addtional Carrot = " + carrot);
			maintotal+=carrot;
		}
		
		if(sauce!=0) {
			System.out.println("Cost of addtional Sauce = " + sauce);
			maintotal+=sauce;
		}
		
		System.out.println("Grand Total price = " + maintotal);
	}
	
	
	
	
}



