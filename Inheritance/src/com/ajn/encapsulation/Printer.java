package com.ajn.encapsulation;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerlevel, boolean isDuplexPrinter) {
		
		if(tonerlevel<0 && tonerlevel>100) {
			this.tonerLevel=-1;
		}else {
			this.tonerLevel = tonerlevel;
		}
		this.pagesPrinted = 0;
		this.duplex = isDuplexPrinter;
	}


	public int fillToner(int tonerlevel) {
		
		if(tonerlevel<=100 && tonerlevel>0) {
			if((tonerlevel+this.tonerLevel)<=100) {
				this.tonerLevel+=tonerlevel;
				return this.tonerLevel;
			}else {
				return -1;
			}
		}else {
			return -1;
		}
	}
	
	public int printPages(int noofpagesprinted){
		int pagestoprint = noofpagesprinted;
		System.out.println("Page is printing");
		
		if(duplex) {
			pagestoprint = (pagestoprint/2) +(pagestoprint%2) ;
			System.out.println("Printing in Duplex mode");
		}
		this.pagesPrinted+=pagestoprint;
		return pagestoprint;
		
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
}
