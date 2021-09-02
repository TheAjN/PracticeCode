package com.ajn.challenge1;


public class Vehicle {

	private int seat;
	private int speed;
	
	private int direction;
	
	
	public Vehicle() {
		this(0, 0);
	}

	public Vehicle(int seat, int speed) {
		this.seat = seat;
		this.speed = speed;
		
		this.direction=0;
	}


	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getMove() {
		return speed;
	}

	public void setMove(int speed) {
		System.out.println("Vehicle move called");
		this.speed = speed;
	}
	
	public void updateSteer(int direction) {
		this.direction+=direction;
		System.out.println("Direction updated by " + direction +" Degrees");
	}
	
	public void moving(int speed, int direction) {
		this.speed=speed;
		this.direction=direction;
		System.out.println("Vehicle moving at " +speed+"kmh at " +direction+ " degrees.");
	}
	
	public void stop() {
		this.speed=0;
	}

}
