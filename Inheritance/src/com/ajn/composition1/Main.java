package com.ajn.composition1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimensions dimensions= new Dimensions(20, 20, 5);
		Case theCase= new Case("TB45","Acer", "240", dimensions);
		
		Monitor monitor=new Monitor("DTP 44","Dell", 27, new Resolution(2540, 1440));
		
		Motherboard motherboard=new Motherboard("i7", "intel", 4, 6, "V3.55");
		
		PC pc=new PC(theCase, monitor, motherboard);
		
//		pc.getMotherboard().loadprogram("Calculator");
//		pc.getMonitor().loadPixels(7, 40, "RED");
//		pc.getTheCase().pressPowerButton();
		
		pc.powerUp();
	}

}
