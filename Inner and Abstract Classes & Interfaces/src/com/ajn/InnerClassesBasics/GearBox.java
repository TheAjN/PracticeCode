package com.ajn.InnerClassesBasics;

import java.util.ArrayList;

public class GearBox {

	private ArrayList<Gear> Gears;
	private int maxGears;
	//private int gearNumber =0;
	
	private int currentGear = 0;
	private boolean clutchIsIn;
	
	public GearBox(int maxGears) {
		Gears = new ArrayList<Gear>();
		this.maxGears = maxGears;
		Gear neutral = new Gear(0,0.0);
		this.Gears.add(neutral);
		
		
		for (int i = 0; i < maxGears; i++) {
			addGear(i, i*5.3);
		}
	}
	
	public void Clutch(boolean in) {
		this.clutchIsIn = in;
	}
	
	private void addGear(int number, double ratio) {
		
		if(number>0 && number<=maxGears) {
			this.Gears.add(new Gear(number,ratio));
		}
		
	}
	
	public void changeGear(int newGear) {
		
		if(newGear>=0 && (newGear<=this.Gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			
			System.out.println("Gear "+newGear+" selected.");
		}else {
			System.out.println("GRIND!!!!");
			this.currentGear = 0;
		}
	}
	
	public double wheelSpeed(int revs) {
		if(clutchIsIn) {
			System.out.println("Scream!!"); //We are not moving!
			return 0.0;
		}
		
		return revs* this.Gears.get(currentGear).getRatio();
	}

	private class Gear {
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		

		private double getRatio() {
			return ratio;
		}


		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}
	}

}
