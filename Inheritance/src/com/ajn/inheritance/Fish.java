package com.ajn.inheritance;



public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;
	

	public Fish(String name, int size, int weight, int gills, 
			int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	
	public int getGills() {
		return gills;
	}


	public void setGills(int gills) {
		this.gills = gills;
	}


	public int getEyes() {
		return eyes;
	}


	public void setEyes(int eyes) {
		this.eyes = eyes;
	}


	public int getFins() {
		return fins;
	}


	public void setFins(int fins) {
		this.fins = fins;
	}


	private void rest() {
		System.out.println(super.getName() + " Fish is Resting");
	}
	
	private void moveFins() {
		System.out.println("Fish.moveFins() is called");
	}
	
	private void useGills() {
		System.out.println("Fish.useGills() is called to breathe");
	}
	

	public void swim(int speed) {
		
		moveFins();
		useGills();
		super.move(speed);
	}
	
	public void chill() {
		System.out.println("Fish.chill() is called");
		rest();
		
	}
	
}
