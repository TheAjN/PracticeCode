package com.ajn.SetsChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ajn.SetsChallenge.HeavenlyBody.bodyTypes;
import com.ajn.SetsChallenge.HeavenlyBody.key;

public class setChallengeMain {
	
	private static Map<HeavenlyBody.key, HeavenlyBody> solarsystem2 = new HashMap<>();
	private static Set<HeavenlyBody> solarSystem = new HashSet<>();
	
	
	public static void main(String[] args) {
			
		  /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/
		
	//	HeavenlyBody testBody =new HeavenlyBody("Test",232,bodyTypes.DWARFPLANET);
				//testBody object, which is an object of heavenlyBody, will give an error because 
				//HeavenlyBody is an abstract class
		
		
		
		HeavenlyBody earth = new PLANET("Earth", 365);
		
		
		
		HeavenlyBody moon = new MOON("Moon", 27);
		solarSystem.add(earth);
		earth.addSatellite(moon);
		
		solarsystem2.put(earth.getKey(), earth);
		solarsystem2.put(moon.getKey(), moon);
		
		HeavenlyBody temp = new PLANET("Mercury", 88);
		//solarSystem.put(temp.getName(), temp);
		solarSystem.add(temp);
		
		temp = new PLANET("Venus", 225);
	//	solarSystem.put(temp.getName(), temp);
		solarSystem.add(temp);
		
		
		temp = new PLANET("Mars", 543);
		solarsystem2.put(temp.getKey(), temp);
		
	//	temp = solarsystem2.get("Mars");
		temp = solarsystem2.get(HeavenlyBody.makekey("Mars",HeavenlyBody.bodyTypes.PLANET));
		
		//	solarSystem.put(temp.getName(), temp);
			solarSystem.add(temp);
		
			HeavenlyBody tempMoon = new MOON("Deimos", 1.8);
			solarSystem.add(tempMoon);
			temp.addSatellite(tempMoon);	

			tempMoon = new MOON("Phobos", 1.8);
			solarSystem.add(tempMoon);
			temp.addSatellite(tempMoon);
		
			System.out.println("All the moons");
			for (HeavenlyBody d : solarSystem) {
				
				if(d.getKey().getBodyType() == bodyTypes.PLANET) {
					System.out.println("Planet "+ d.getKey());
				}
			
				for (HeavenlyBody s : d.getSatellites() ) {
					if (s.getKey().getBodyType() == bodyTypes.MOON) {
						System.out.println(s.getKey());
					}
				}
			}
			
			
			
			for (HeavenlyBody s : solarSystem) {
				System.out.println(s);
			}
			
			System.out.println();
		
			
			HeavenlyBody pluto = new PLANET("Pluto",832);
			solarSystem.add(pluto);
			solarsystem2.put(pluto.getKey(), pluto);
			
		
			
			
		pluto = new DWARFPLANET("Pluto",83222222);
			solarSystem.add(pluto);
			
			for (HeavenlyBody planet : solarSystem) {
					System.out.println(planet.getKey().getName()+" : "+planet.getOrbitalPeriod()); 
							//To check if duplicates of pluto is appearing or not, which it does
						//This problem is caused due to sets/ maps having own objects as a key/element
					//in their map/set
				
			}
			
			
			//Test case 2
			
			System.out.println();
		//	System.out.println(pluto1.equals(pluto2));
		//	System.out.println(pluto2.equals(pluto1));
			
			
			//Test case 4 and 6 
			solarsystem2.put(pluto.getKey(), pluto);
	//		solarsystem2.put(pluto2.getKey(), pluto2);
			
			System.out.println(solarsystem2.get(HeavenlyBody.makekey("Pluto", HeavenlyBody.bodyTypes.PLANET)));
			System.out.println(solarsystem2.get(HeavenlyBody.makekey("Pluto", HeavenlyBody.bodyTypes.DWARFPLANET)));
			//makekey() is a static method, Therefore HeavenlyBody is used to call makekey()
			
			System.out.println();
			for (HeavenlyBody heavenlyBody : solarsystem2.values()) {
				System.out.println(heavenlyBody); 
					
		}
			
	}

}
