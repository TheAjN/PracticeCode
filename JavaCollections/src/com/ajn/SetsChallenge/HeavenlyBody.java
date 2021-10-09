package com.ajn.SetsChallenge;

import java.util.HashSet;
import java.util.Set;

import com.ajn.random.learn.doublefloat;

public abstract class HeavenlyBody {

//	private String name;			 
	private double orbitalPeriod;	
	private Set<HeavenlyBody> satellites;	//These 2 fields(name & bodyTypes) are not required
//	private bodyTypes bodyType;				// since they are present in the Inner class key
	private final key key;

	public enum bodyTypes {
		STAR, MOON, PLANET, ASTERIOD,DWARFPLANET

	}

	public HeavenlyBody(String name, double orbitalPeriod, bodyTypes bodyType) {
	//	this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		
		this.key = new key(name, bodyType); //Every time a HeavenlyBody is created, a key is generated here
		satellites = new HashSet<>();
	//	this.bodyType = bodyType;
	}

//	public String getName() {
//		return name;
//	}
//
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

//	public bodyTypes getBodyType() {
//		return bodyType;
//	}

	
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	public key getKey() {
		return key;
	}

	public boolean addSatellite(HeavenlyBody satellite) {
		if (satellite.key.getBodyType() == bodyTypes.MOON) {
			return satellites.add(satellite);
		}
		return false;
	}

	@Override
	public final boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
			return true;
		}

		if (o instanceof HeavenlyBody) {			//this checks one of the criterias in the challenge
											//ie, 2 HeavenlyBs can have the same name with different bodType
			HeavenlyBody obj = (HeavenlyBody) o;	
			
			return this.key.equals(obj.key);
//			String objname = obj.getName();
//			if (this.getName().equals(objname)) {
//				return this.bodyType == obj.getBodyType();  //returning bodyType
//			}
		}

		return false;
	}

	@Override
	public final int hashCode() {
		
	//	return this.name.hashCode() + 57 +  this.bodyType.hashCode(); //generating hashCode
		
		return this.key.hashCode();
	}

	@Override
	public String toString() {  //when we try to  print an object, Java implicitly calls this function 
		return "name=" + key.name + ", orbitalPeriod=" + orbitalPeriod + ", bodyType=" + key.bodyType ;
	}

	
//	public Boolean addBodyType(T btype) {
//		return this.bodyType.add(btype);
//	}

	
	
	public static key makekey(String name, bodyTypes bodyType) {
		return new key(name, bodyType);
	}
	
	
	public static final class key{  //Why static? - to prevent this class to access methods & fields
		private String name;		// from the class within which it is nested (HeavenlyBody)
		private bodyTypes bodyType;
	
		public key(String name, bodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}
		
		

		public String getName() {
			return name;
		}




		public bodyTypes getBodyType() {
			return bodyType;
		}



		@Override
		public boolean equals(Object o) {
	
			if (this == o) {
				return true;
			}
				
			if(o instanceof key) {
				key obj = (key) o; 
				
				if(this.name.equals(obj.getName())) {
					return this.bodyType == obj.getBodyType();
				}
			}
			
			return false;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode() + this.bodyType.hashCode() + 57 ;
		}



		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Name = " + this.name + " : Body type = " + this.bodyType;
		}
		
		
		
	}	
	
}
