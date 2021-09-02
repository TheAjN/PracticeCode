package com.ajn.compositionchallenge1;

public class Fan {

	private String manufacturer;
	private String colour;
	
	public Fan(String manufacturer, String colour) {
		this.manufacturer = manufacturer;
		this.colour = colour;
	}
	
	public void switchonFan() {
		System.out.println("Turn ON Fan " + manufacturer);
	}
	
	public String getColour() {
		return colour;
	}	
	
}
