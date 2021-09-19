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
		
		temp = new HeavenlyBody("Mars", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		

		tempMoon = new HeavenlyBody("Deimos", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);	

		tempMoon = new HeavenlyBody("Phobos", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		
		temp = new HeavenlyBody("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon = new HeavenlyBody("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("Europa", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon); //the reference of the object Europa is added to the
		temp.addMoon(tempMoon);							// Solar system map & Satellite Set within Heavenlybody
													//But only one instance of Europa is present
		tempMoon = new HeavenlyBody("Ganymede", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("Callisto", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		temp = new HeavenlyBody("Saturn", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Uranus", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		
		temp = new HeavenlyBody("Neptune", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Pluto", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		
		
		System.out.println("Planets");
		for(HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getName());
		}
		System.out.println();
		
		HeavenlyBody body = solarSystem.get("Jupiter");
		System.out.println("Satellites of "+body.getName());
		for (HeavenlyBody satellites : body.getSatellites()) {
			System.out.println("\t"+satellites.getName());
			
		}
		
		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());	//union of all moons
		}
		
		
		System.out.println("All the moons");
		for (HeavenlyBody moon : moons) {
			System.out.println("\t"+moon.getName());
		}
		
		
		HeavenlyBody pluto = new HeavenlyBody("Pluto",832);
		planets.add(pluto);
		
		for (HeavenlyBody planet : planets) {
				System.out.println(planet.getName()+" : "+planet.getOrbitalperiod()); 
						//To check if duplicates of pluto is appearing or not, which it does
					//This problem is caused due to sets/ maps having own objects as a key/element
				//in their map/set
			
		}
		
		Object o = new Object();
		o.equals(o);
		
		"Pluto".equals("");
		
		
	}

}
