package com.ajn.inheritance;


public class Dog extends Animal {

	private int legs;
	private String coat;
	private int eyes;
	private int tail;
	private int teeth;
	
	public Dog(String name, int size, int weight, int legs, String coat, int eyes, int tail, int teeth) {
		
		super(name, 1, 1, size, weight); //Calls the class which the dog class extended from (Animal)
		this.legs = legs;
		this.coat = coat;
		this.eyes = eyes;
		this.tail = tail;
		this.teeth = teeth;
		// TODO Auto-generated constructor stub
	}

	
	public Dog() {
		this("No name for the Dog", 0, 0 , 4, "Unknown", 0, 1, 0);
		// TODO Auto-generated constructor stub
	}


	private void chew() {
		System.out.println("Dog.chew() is called");
	}
	

	
	@Override
	public void eat() {
		System.out.println("Dog.eat() is called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() is called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() is called");
		move(10);
		
	}

	private void useLegs() {
		System.out.println("Dog.useLegs() is called (private method)");	
	}
		
	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Dog.move() is called");
		useLegs();
	    super.move(speed);
	}
	
	

}

	


