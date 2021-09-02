package com.aj.codingExercise;

public class PrintMegabytesandKilobytes {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(-1024);
	}
	
	public static void printMegaBytesAndKiloBytes(int kb) {
	
		if(kb>=0) {
		int kb2= kb%1024;
		int mb = kb/1024;
		System.out.println(kb + " KB = " + mb + " MB and " + kb2 + " KB");
		}else {
			System.out.println("Invalid Value");
		}
	}
}
