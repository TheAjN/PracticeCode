package com.ajn.compositionchallenge1;


public class Table {

	private Dimension dimensions;
	private String colour;
	
	
	public Table(Dimension dimensions, String colour) {
		this.dimensions = dimensions;
		this.colour = colour;
	}
	
	public void VolumeoftheTable() {
		System.out.println("Table volume =  "+ dimensions.volume());
	}

	public String getColour() {
		return colour;
	}	
}
