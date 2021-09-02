package com.ajn.forloop;



public class isPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	findprime(23);
	}

	
	
	public static boolean prime2(int n) {
		
		boolean result=true;
		if(n>=2) {
			for (int i = 2; i <= (long)Math.sqrt(n) ; i++) {
				System.out.println("looping - "+i);
				if(n%i==0) {
					result= false;
				}
			}
		}else {
			return false;
		}
		
		return result;
	}
	
	
	public static void findprime(int n) {
		int count=0;
//		if(prime2(n)) {
//			System.out.println("Prime number - " + n);
			
			for(int i=0; i<n; i++) {
//				for(int j=2;j<=(i/2);j++) {
//					if((j%i)!=0) {
//						count++;
//					}
//				}
				if(prime2(i)) {
					count++;
					System.out.println("Number "+ i +" is a prime number");
					if(count==10) {
						break;
					}
				}
				
			}
	//	}
		System.out.println("Number of prime numbers - " + count);
	}
	
}
