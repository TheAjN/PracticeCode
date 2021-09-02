package com.ajn.challenge1;


public class MarutiSuzuki extends Car {
	
	private String colour;
	private String GearBox;
	private int KEY;
	
	public MarutiSuzuki() {
		this("998cc",0, 1, "Brown", "Manual");
	}
	
	public MarutiSuzuki(String engine,int speed,int gear, String colour, String gearBox) {
		super(4, speed, true, 4, true, engine,2, gear);
		this.colour = colour;
		this.GearBox = gearBox;
		this.KEY=25626870;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGearBox() {
		return GearBox;
	}

	public void setGearBox(String gearBox) {
		GearBox = gearBox;
	}	

	public void fullThrottle(int speed) {
		System.out.println("Full Throttle called");
		super.setMove(speed);
	}
	
	public void accelerate(int rate) {
		
		int newvelocity=getMove()+rate;
		if(newvelocity<=0) {
			stop();
			setGear(1);
		}else if(newvelocity>0 && newvelocity<=10) {
			setGear(1);
		}else if(newvelocity>10 && newvelocity<=20) {
			setGear(2);
		}else if(newvelocity>20 && newvelocity<=30) {
			setGear(3);
		}else {
			setGear(4);
		}
		
		
		if(newvelocity>0) {
			changeVelocity(newvelocity,getDirection());
		}
	}
	
	public void start(int key,int rate) {
		if(KEY==key) {
			getHeadlights();
			accelerate(rate);
		//	fullThrottle(60);
		}	else {
			System.out.println("Wrong Key");
		}
	}
}
