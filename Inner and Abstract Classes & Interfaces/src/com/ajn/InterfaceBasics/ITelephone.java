package com.ajn.InterfaceBasics;

public interface ITelephone {

	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
