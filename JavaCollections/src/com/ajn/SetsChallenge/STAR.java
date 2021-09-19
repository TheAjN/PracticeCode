package com.ajn.SetsChallenge;

import java.util.HashSet;
import java.util.Set;



public class STAR extends HeavenlyBody{
	
	private Set<HeavenlyBody> satellite;
	
	
	public STAR(String name, double orbitalPeriod) {
		super(name, orbitalPeriod,bodyTypes.STAR);
		satellite = new HashSet<HeavenlyBody>();
		// TODO Auto-generated constructor stub
	}
	
	public boolean body(HeavenlyBody Moon) {
		return satellite.add(Moon);
	}
	
}
