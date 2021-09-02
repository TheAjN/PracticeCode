package com.ajn.random.learn;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tpscr= 90;
		 int sc=23;
		 int sb=45;
		 if((tpscr <100) && (tpscr>sc)) {
			 System.out.println("legal stuff!!");
		 }
		 
		 if((sc >100) || (sb>sc)) {
			 System.out.println("legal or stuff!!");
		 }
		 
		 int bet= 40;
		 if(bet==40) {
			 System.out.println("Error!!!!");
		 }
		 
		 boolean car=false;
		 if (!car) {
			System.out.println("Car is true");
		}
		 
		 boolean warcar;
		 warcar=car?true:false;
		 
		 if(!warcar)
			System.out.println("warcar is true"); 
	}

}
