package com.ajn.ArrayListChallenge1;

public class Contacts {

	private String name;
	private String number;
	
	public Contacts() {
		name =null;
		number=null;
	}
	
	public Contacts(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}	

	public static Contacts createContactRecord(String name, String number) {
		return new Contacts(name,number);
	}
}
