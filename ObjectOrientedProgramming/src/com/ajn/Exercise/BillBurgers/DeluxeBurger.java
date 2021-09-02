package com.ajn.Exercise.BillBurgers;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 14.54 + 2.75 + 1.81, "White");
		// TODO Auto-generated constructor stub
		
		System.out.println("Added Chips for an extra " + 2.75);
		System.out.println("Added Drink for an extra " + 1.81);
	}

	@Override
	public void addHamburgerAddition1(String addition1Name, double addition1Price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String addition2Name, double addition2Price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String addition3Name, double addition3Price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String addition4Name, double addition4Price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

}
