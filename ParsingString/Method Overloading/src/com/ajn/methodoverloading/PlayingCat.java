package com.ajn.methodoverloading;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatplaying(true, 36));
	}

	
	public static boolean isCatplaying(boolean summer, int temp) {
		
		if(summer) {
			if(temp>=25 && temp<=45) {
				return true;
			}
		}else {
			if(temp>=25 && temp<=35) {
				return true;
			}
		}
		return false;
	}
}
