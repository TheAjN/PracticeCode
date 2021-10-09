package com.ajn.SelfSetsChallenge;

public class Planet extends HeavenlyBody {

	public Planet(String name, double orbitalperiod) {
		super(name, orbitalperiod, BodyTypes.PLANET);
		
	}

	@Override
	public boolean addSatellite(HeavenlyBody satellite) {
	
		if (satellite.getKey().getBodyType() == BodyTypes.MOON) {
			return super.addSatellite(satellite);
		}
		
		return false;
	}
	
	
	
}
