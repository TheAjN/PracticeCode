package com.ajn.SetsHashSetsBasics;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

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
}
