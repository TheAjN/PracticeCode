package com.ajn.forloop;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(8);
	}
	
	public static void printSquareStar(int num) {
		
		
		if(num < 5) {
			System.out.println("Invalid Value");
		}else {
			for(int i=1; i<=num;i++) {
				for(int j=1;j<=num;j++) {
					if(i==1 || i==num) {
						System.out.print("*");
					}else if(i==j) {
						System.out.print("*");
					}else if(j==num-i+1) {
						System.out.print("*");
					}else if(j==1 || j== num) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}	
		}
	}
	

}
