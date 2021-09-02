package com.ajn.switchstatementt;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		
		switch(x) {
		
		case 1:
			System.out.println("It is 1 -  " + x );
			break;
		case 2:
			System.out.println(x);
			break;
			
		case 3:case 4: case 5:	System.out.println("3 or 4 or 5");
		break;
			default:
				System.out.println(x);
		
		}
		
		s.close();
		
	}

}
