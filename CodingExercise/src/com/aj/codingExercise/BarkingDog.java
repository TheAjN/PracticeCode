package com.aj.codingExercise;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shouldWakeUp(true, 22));
	}

	
	public static boolean shouldWakeUp(boolean bark, int houroftheday) {
		
		if(bark)
		{
			if((houroftheday<8 && houroftheday>-1 )||  houroftheday == 23 )
			{
				return true;
			}
			else if(houroftheday<0 && houroftheday>23) {
				return false;
			}
		}
		
		return false;
	}
}
