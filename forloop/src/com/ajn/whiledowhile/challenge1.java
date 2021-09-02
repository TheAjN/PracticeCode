package com.ajn.whiledowhile;

public class challenge1 {

	public static void main(String[] args) {
		printEvenNumber(4, 20);
	
	}

	
	
	public static boolean isEvenNumber(int num) {
		
		return ((num%2)==0)?true:false;
	}
	
	
	public static void printEvenNumber(int st, int end) {
		int count=0;
		while(st<=end){
			st++;
			if(!isEvenNumber(st)) {
				continue;
			}	
			
			System.out.println("Even Numbers - " + st);
			count++;
			if(count==5){
				System.out.println("Number of Even numbers found - " + count);
				break;
			}
			
		}
		
	}
	
}
