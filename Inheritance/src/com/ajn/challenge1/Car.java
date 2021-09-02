package com.ajn.challenge1;

public class Car extends Vehicle {

	private boolean Steering;
	private int wheels;
	private boolean roof;
	private String engine;
	private int headlights;
	private int gear;
	
	public Car() {
		this(0, 0, true, -1, false, "Unknown",0, 1);
	}
	
	public Car(int seat, int speed, boolean steering, int wheels, boolean roof, String engine, int headlights, int gear) {
		super(4, speed);
		this.Steering = steering;
		this.wheels = wheels;
		this.roof = roof;
		this.engine = engine;
		this.headlights = headlights;
		this.gear=gear;
	}

	public boolean isSteering() {
		return Steering;
	}

	public void setSteering(boolean steering) {
		Steering = steering;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean getRoof() {
		return roof;
	}

	public void setRoof(boolean roof) {
		this.roof = roof;
	}

	public String getEngine() {
		if(!((engine==null)||(engine==""))) {
			System.out.println("Vroom Vroom");
			return engine;
		}else {
			return "Engine didn't Start";
		}
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getHeadlights() {
		System.out.println("Headlight is ON");
		return headlights;
	}

	public void setHeadlights(int headlights) {
		this.headlights = headlights;
	}
	
	
	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getGear() {
		return gear;
	}

	public void changeGear(int gear) {
		this.gear = gear;
		System.out.println("Car.changeGear() is called to change gear - " + gear);
	}

	@Override
	public void setMove(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Car move called");
		super.setMove(speed);
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVelocity() Called");
		moving(speed, direction);
	}	
	
}
