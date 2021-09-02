package com.ajn.composition1;



public class Monitor {

	private String model;
	private String manufacturerString;
	private int size;
	private Resolution nativeResolution;  //This is composition
	
	
	
	public Monitor(String model, String manufacturerString, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturerString = manufacturerString;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}



	public void loadPixels(int x, int y, String colour) {
		System.out.println("Pixel at ("+ x +","+ y + ") of colour "+colour );
	}



	public String getModel() {
		return model;
	}



	public String getManufacturerString() {
		return manufacturerString;
	}



	public int getSize() {
		return size;
	}



	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	
	
}
