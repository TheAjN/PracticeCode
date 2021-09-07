package com.ajn.SetsHashSetsBasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	private static Map<String, HeavenlyBody> solarSystem = new HashMap<String, HeavenlyBody>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);		//Since Moon is a heavenlybody, which is also a satellite of Earth,
									//HeavenlyBody Moon is added as satellite in Heavenlybody Earth

	}

}
