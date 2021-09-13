package com.ajn.SetsHashSetsBasics;

import java.util.HashSet;
import java.util.Set;

import sun.tools.tree.ThisExpression;

public final class HeavenlyBody {	//to prevent HeavenlyBody class to be subclassed

	private final String name;		
	private final double orbitalperiod;
	private final Set<HeavenlyBody> satellites;		
	
	public HeavenlyBody(String name, double orbitalperiod) {
		this.name = name;
		this.orbitalperiod = orbitalperiod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalperiod() {
		return orbitalperiod;
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	
	
	

	@Override
	public boolean equals(/*HeavenlyBody*/Object  obj) { //the reason the error is coming is due to the method getting
											//overloaded by the built in equals method
											//to fix this comment HeavenlyBody and replace it to Object
		if(this == obj) {  //if obj.equals(obj) where both obj are the same
			return true;
		}
		
		System.out.println("obj.getClass()" + obj.getClass());
		System.out.println("this.getClass()" + this.getClass());
		if((obj==null) || (obj.getClass()!=this.getClass())) { //similiar to instanceof keyword
			return false;
		}
		
		String objName = ((HeavenlyBody) obj).getName();
		return this.getName().equals(objName);
	}
	

	@Override
	public int hashCode() {
		System.out.println("hashcode called");
	//	return super.hashCode();
		return this.name.hashCode() + 57; //57 is added to make the hashcode non zero
	}
	

	
}
