package com.ajn.InterfaceBasics;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITelephone TimsTelephone;
		TimsTelephone = new DeskPhone(123456);
		
		TimsTelephone.powerOn();
		TimsTelephone.callPhone(123456);
		
		TimsTelephone = new MobilePhone(8557445);
		//TimsTelephone.powerOn();
	//	TimsTelephone.dial(8557445);
		TimsTelephone.callPhone(8557445);
		TimsTelephone.answer();
	}

}
