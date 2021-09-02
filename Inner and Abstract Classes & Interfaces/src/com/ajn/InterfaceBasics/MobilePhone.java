package com.ajn.InterfaceBasics;

public class MobilePhone implements ITelephone{


	private int myNumber;
	private boolean isRinging;
	private boolean isOn;
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone is switched ON");
	}
	
	@Override
	public void dial(int phoneNumber) {
		if (isOn) {
			System.out.println("Now ringing "+phoneNumber+" on Mobile phone");
		}else {
			System.out.println("Mobile Phone is switched off");
		}	
	}
	
	
	
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone");
			isRinging=false;
		}	
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		
		if(phoneNumber == myNumber && isOn ) {
			isRinging=true;
			System.out.println("Melody ring");
		}else {
			isRinging=false;
			System.out.println("Mobile Phone is switched off or wrong number provided");
		}
		
		return isRinging;
	}
	
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
	
		
}
