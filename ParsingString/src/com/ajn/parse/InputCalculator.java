package com.ajn.parse;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		int sum = 0, count = 0;
		long avg = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			boolean hasint = scanner.hasNextInt();
			
			if (hasint) {
				int num = scanner.nextInt();
				sum += num;
				count++;
			} else if(!hasint && (sum==0 && avg==0)) {
				System.out.println("SUM = 0 AVG = 0");
				break;
				
			}else  {
				avg = Math.round((((double)sum) / count)) ;
				System.out.println("SUM = " +sum + " AVG = " + avg);
				break;
			}
			
			scanner.nextLine();
		}

		
		scanner.close();
	}
}
