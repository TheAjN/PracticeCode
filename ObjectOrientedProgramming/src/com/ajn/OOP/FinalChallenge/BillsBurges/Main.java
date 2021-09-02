package com.ajn.OOP.FinalChallenge.BillsBurges;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hamburger hamburger= new Hamburger("Abhi", "Plain", 6);
		hamburger.addLettuce();
		hamburger.addCarrot();
		hamburger.totalPrice();
		
		System.out.println("-----------------------------------------------");
		
		DeluxeBurger d= new DeluxeBurger("AJN", "Italian", 8.25);
		d.totalPrice();
		
		System.out.println("-----------------------------------------------");
		HealthyBurger health= new HealthyBurger("A Naik", "chicken", 5.50);
		
		health.addCarrot();
		health.addCucumber();
		health.addLettuce();
		health.totalPrice();
	}

}
