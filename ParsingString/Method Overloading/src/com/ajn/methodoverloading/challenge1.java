package com.ajn.methodoverloading;

public class challenge1 {
	
	public static double calacFeetInchestoCenti(double ft,double in) {
		 
		if(ft>=0 && in>=0 && in<=12) {
			double cm = (((ft*12)+in)*2.54);
			return cm;
		}
		return -1;
	}
	
	
	public static double calacFeetInchestoCenti(double in) {
		 
		if( in>=0 ) {
		
			double ft = (in/12);
			in%=12;
			System.out.println(" Feet - " + Math.floor(ft) + ", Inches - " + in );
			return calacFeetInchestoCenti(Math.floor(ft), in);
		}
		
		return -1;
	}
	
}
