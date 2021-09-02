package com.ajn.compositionchallenge1;

public class Chair {

	private Dimension dimensions;
	private String colour;
	
	public Chair(Dimension dimensions, String colour) {
		this.dimensions = dimensions;
		this.colour = colour;
	}
	
	public void chairVolume() {
		System.out.println("chair volume = " + dimensions.volume());
	}
	
	public String getColour() {
		return colour;
	}
	
}
