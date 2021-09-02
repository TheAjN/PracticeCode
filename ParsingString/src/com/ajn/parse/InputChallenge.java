package com.ajn.parse;

import java.util.Scanner;

public class InputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		while (count < 10) {

			System.out.println("Enter number #" + (count + 1) + " ");
			boolean hasNextInt = sc.hasNextInt();
			if (hasNextInt) {
				int num = sc.nextInt();
				sum += num;
				count++;
			} else {
				System.out.println("Invalid Number");
			}
			sc.nextLine(); //handle enter key problem, if the condition is false
		}
		if (count == 10) {
			System.out.println(sum);
		}
		sc.close();
	}
}
