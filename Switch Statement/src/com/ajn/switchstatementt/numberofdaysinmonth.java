package com.ajn.switchstatementt;

public class numberofdaysinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDaysInMonth(4, -90));
		
	}

	
	
	public static boolean isLeapYear(int y) {
		
		if(y<1 || y>9999)
		{
			return false;
		}
		
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}	
	}
	
	
	public static int getDaysInMonth(int m, int y) {
		
		if(y<1 || y>9999 || m<1 || m>12)
		{
			return -1;
		}
		
		switch(m) {
		
		case 1:
			return 31;
			
		case 2:
			if(isLeapYear(y)) {
				return 29;
			}else {
				return 28;
			}
			
		case 3:
			return 31;
			
		case 4:
			return 30;
			
		case 5:
			return 31;
			
		case 6:
			return 30;
			
		case 7:
			return 31;
			
		case 8:
			return 31;
			
		case 9:
			return 30;
			
		case 10:
			return 31;
			
		case 11:
			return 30;
			
		case 12:
			return 31;
		
			default:
				return -1;
				
		}
	}
	
}
