package com.ajn.methodoverloading;

public class challenge2 {
	
	public static final String  INVALID_VALUE = "Invalid value";
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(70, 7));
		System.out.println(getDurationString(3600));

	}
	
	
	
	private static String getDurationString(int min, int sec) {
		
		if(min<0 || sec>59 || sec<0) {
			return INVALID_VALUE;
		}
		
		int hr = min/60;
		min%=60;
		return  printtime(hr, min, sec) ;
	}
	
	public static String getDurationString(int sec) {
	
		if(sec<0) {
			return INVALID_VALUE;
		}
		
		int min = sec/60;
		sec%=60;
		return getDurationString(min, sec);
	}
	
	public static String printtime(int hr,int min,int sec) {
		String op;
		if(hr<10 && min<10 && sec<10 ) {
			op = "0" + hr + "h " +"0"+ min + "m " +"0"+ sec + "s";
		}else if(min<10 && sec<10 ) {
			op = hr + "h " +"0"+ min + "m " +"0"+ sec + "s";
		}else if(hr<10 && sec<10 ) {
			op ="0"+ hr + "h " + min + "m " +"0"+ sec + "s";
		}else if(hr<10 && min<10 ) {
			op ="0"+ hr + "h " +"0"+  min + "m " +sec + "s";
		}else if(sec<10) {
			op = hr + "h " + min + "m " +"0"+ sec + "s";
		}else if(min<10) {
			op = hr + "h " +"0" +min  +"m " + sec + "s";
		}else if(hr<10) {
			op = "0" +hr + "h " + min  +"m " + sec + "s";
		}
		else {
			op = hr + "h " + min + "m " + sec + "s";
		}
		
		return op;
	}
}
