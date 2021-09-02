package com.ajn.composition1;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bioString;
	
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bioString) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bioString = bioString;
	}
	
	public void loadprogram(String program) {
		System.out.println("MotherBoard program " + program);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBioString() {
		return bioString;
	}
	
	
	
}
