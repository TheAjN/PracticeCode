package com.ajn.InnerClassesBasics;

import java.util.Scanner;



public class Main {

	private static	Scanner scanner = new Scanner(System.in);
	private static Button  btPrint = new Button("Print");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(System.getProperty("java.runtime.version"));
		
//		GearBox bentley = new GearBox(5);
////		GearBox.Gear first= bentley.new Gear(1,12.5);
////		
////		GearBox.Gear secondGear = new bentley.Gear(1,4.2);
////		GearBox.Gear secondGear = new GearBox.Gear(1,4.2);
////		
////	System.out.println(first.driveSpeed(1000));
//		
////		bentley.addGear(1, 5.3);
////		bentley.addGear(2, 10.6);
////		bentley.addGear(3, 15.9);
//		bentley.Clutch(true);
//		bentley.changeGear(1);
//		bentley.Clutch(false);
//		System.out.println(bentley.wheelSpeed(1000));
//		bentley.changeGear(2);
//		System.out.println(bentley.wheelSpeed(3000));
//		bentley.Clutch(true);
//		bentley.changeGear(3);
//		bentley.Clutch(false);
//		System.out.println(bentley.wheelSpeed(6000));
//		
//		
//			class ClickListener implements Button.OnClickListener{
//
//			public ClickListener() {
//				System.out.println("I have been attached");
//				// TODO Auto-generated constructor stub
//			}
//
//			@Override												//LOCAL CLASS
//			public void onClick(String title) {
//				// TODO Auto-generated method stub
//				System.out.println(title+" is clicked");
//			}
//			 
//		 }
//			
//		btPrint.setOnCLickListener(new ClickListener());
		
		btPrint.setOnCLickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				// TODO Auto-generated method stub
				System.out.println(title + " was clicked.");
			}
		});
		listen();
	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				quit= true;
				break;

			case 1:
				btPrint.onClick();
				break;
			}
		}
		scanner.close();
	}
	
}
