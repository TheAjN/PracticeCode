package com.ajn.SetsChallenge;

import java.util.HashSet;
import java.util.Set;


public class PLANET extends HeavenlyBody{

	private Set<HeavenlyBody> satellite;
	
	public PLANET(String name, double orbitalPeriod) {
		super(name, orbitalPeriod,bodyTypes.PLANET);
		satellite = new HashSet<>();
		// TODO Auto-generated constructor stub
	}
	
	

	public Set<HeavenlyBody> getSatellite() {
		return satellite;
	}



	@Override
	public boolean addSatellite(HeavenlyBody moon) {
	
		if(moon.getKey().getBodyType() == bodyTypes.MOON) {
			return super.addSatellite(moon);
		}
		return false;
	}
	
	

}
