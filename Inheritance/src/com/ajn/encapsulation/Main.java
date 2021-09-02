package com.ajn.encapsulation;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer(60, true);
		
		printer.fillToner(40);
		System.out.println("Pages that are printed = " + printer.printPages(7));
		System.out.println("Count of pages printed = " + printer.getPagesPrinted());
		
		System.out.println("Pages that are printed = " + printer.printPages(2));
		System.out.println("Count of pages printed = " + printer.getPagesPrinted());
		
		
		Printer printer2 = new Printer(30, false);
		printer2.fillToner(40);
		System.out.println("Pages that are printed = " + printer2.printPages(4));
		System.out.println("Count of pages printed = " + printer2.getPagesPrinted());
		System.out.println("Pages that are printed = " + printer2.printPages(7));
		System.out.println("Count of pages printed = " + printer2.getPagesPrinted());
		
	}

}
