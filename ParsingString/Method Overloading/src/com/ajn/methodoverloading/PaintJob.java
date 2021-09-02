package com.ajn.methodoverloading;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		System.out.println(getBucketCount(3.26, 0.75));
	}

	
	
	public static int getBucketCount(double  w, double h, double arp, int exb) {
		
		if(w<=0 ||h<=0 ||arp<=0 || exb<0 ) {
			return -1;
		}
		
		double totar=w*h;
		double bucketar= arp*exb;
		double temp=arp;
		double tot= totar-bucketar;
		int i=1;
		while(temp<tot) {		
			temp+=arp;
			i++;		
		}
		
		return i;
	}
	
	
	public static int getBucketCount(double  w, double h, double arp) {
		if(w<=0 ||h<=0 ||arp<=0 ) {
			return -1;
		}
		
		double totar=w*h;
		double temp=arp;
		int i=1;
		while(temp<totar) {		
			temp+=arp;
			i++;		
		}
		
		return i;
	}
	
	
	public static int getBucketCount(double area, double arp) {
		
		if(area<=0 ||arp<=0 ) {
			return -1;
		}
		double temp=arp;
		int i=1;
		while(temp<area) {		
			temp+=arp;
			i++;		
		}
		
		return i;
	}
}
