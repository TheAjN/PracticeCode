package com.ajn.challenge1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarutiSuzuki CelerioX= new MarutiSuzuki();
		CelerioX.start(25626870,20);
		System.out.println(CelerioX.getMove());
		CelerioX.updateSteer(50);
		CelerioX.start(25626870, 60);
		CelerioX.start(25626870, -75);
	}

}
