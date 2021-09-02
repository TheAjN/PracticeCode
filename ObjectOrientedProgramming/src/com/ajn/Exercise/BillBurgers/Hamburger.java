package com.ajn.Exercise.BillBurgers;

public class Hamburger {

	private String name;
	private String breadRollType;
	private double price;
	private String meat;
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;

	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.breadRollType = breadRollType;
		this.price = price;
		this.meat = meat;

		System.out.println(
				name+" hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
	}

	public void addHamburgerAddition1(String addition1Name, double addition1Price) {

		this.addition1Name = addition1Name;
		this.addition1Price = addition1Price;
		System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
	}

	public void addHamburgerAddition2(String addition2Name, double addition2Price) {

		this.addition2Name = addition2Name;
		this.addition2Price = addition2Price;
		System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
	}

	public void addHamburgerAddition3(String addition3Name, double addition3Price) {

		this.addition3Name = addition3Name;
		this.addition3Price = addition3Price;
		System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
	}

	public void addHamburgerAddition4(String addition4Name, double addition4Price) {

		this.addition4Name = addition4Name;
		this.addition4Price = addition4Price;
		System.out.println("Added " + addition1Name + " for an extra " + addition4Price);
	}
	
	
	public double itemizeHamburger() {
		
		double total = this.price;
		
		if(addition1Name!=null) {
			total+=addition1Price;
		}
		
		if(addition2Name!=null) {
			total+=addition2Price;
		}
		
		if(addition3Name!=null) {
			total+=addition3Price;
		}
		
		if(addition4Name!=null) {
			total+=addition4Price;
		}
	
		return total;
	}

}
