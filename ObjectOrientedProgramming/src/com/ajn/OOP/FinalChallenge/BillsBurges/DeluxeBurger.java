package com.ajn.OOP.FinalChallenge.BillsBurges;

public class DeluxeBurger extends Hamburger {

	private double drink ;
	private double chips ;

	public DeluxeBurger(String name, String rolltype, double price) {
		super(name, rolltype, price);

		addDrink();
		addChips();
		// TODO Auto-generated constructor stub

	}

	public void addDrink() {
		drink=3;
	}

	public void addChips() {
		chips=2.5;
	}
	
	

	@Override
	public double addTomato() {         //This is to prevent methods from superclass
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double addLettuce() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double addCarrot() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double addSauce() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
		double maintotal = getBasePrice();
		System.out.println("Base Price = " + maintotal);
		if (drink!=0) {
			System.out.println("Cost of addtional Drink = " + drink);
			maintotal += drink;
		}

		if (chips!=0) {
			System.out.println("Cost of addtional Chips = " + chips);
			maintotal +=chips;
		}
		
		super.totalPrice(maintotal);
	}

}
