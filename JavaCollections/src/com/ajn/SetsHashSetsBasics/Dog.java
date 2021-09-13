package com.ajn.SetsHashSetsBasics;

public class Dog {

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public final boolean equals(Object o) { //final is used to prevent Labrador class from using equals()
		if(this == o) {
			return true;
		}
		
		if(o instanceof Dog) {
			String objname = ((Dog) o).getName();
			return this.name.equals(objname);
		}
		
		return false;
		
	}
	
	
}
