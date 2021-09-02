package com.ajn.composition1;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}

	public void drawLogo() {
		monitor.loadPixels(1200, 500, "Green");
	}
//	public Case getTheCase() {
//		return theCase;
//	}
//
//	public Monitor getMonitor() {
//		return monitor;
//	}
//
//	public Motherboard getMotherboard() {
//		return motherboard;
//	}
//	
	
	
	
}
