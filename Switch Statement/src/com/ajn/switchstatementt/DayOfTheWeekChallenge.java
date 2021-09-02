package com.ajn.switchstatementt;

public class DayOfTheWeekChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfTheWeek(-1);
		
		dayofweekifelse(3);
		
	}

	
	private static void printDayOfTheWeek(int day) {
		
		switch(day){
			
			case 0:
				System.out.println("Sunday");
				break;
			
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
			
			case 6:
				System.out.println("Saturday");
				break;
			
			default:
				System.out.println("Invalid Day");
		}	
	}
	
	public static void dayofweekifelse(int d) {
		
		if(d==0) {
			System.out.println("Sunday");	
		}else if(d==1){
			System.out.println("Monday");
		}else if(d==2){
			System.out.println("Tuesday");

		}else if(d==3){
			System.out.println("Wednesday");
		}else if(d==4){
			System.out.println("Thursday");
		}else if(d==5){
			System.out.println("Friday");
		}else if(d==6){
			System.out.println("Saturday");
		}else {
			System.out.println("Invalid Day");
		}
	}
	
	
	
	
	
	
	
}
