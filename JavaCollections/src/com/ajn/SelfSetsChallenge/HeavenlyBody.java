package com.ajn.SelfSetsChallenge;

import java.util.HashSet;
import java.util.Set;


public abstract class HeavenlyBody {

	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	private final Key key;

	
	public enum BodyTypes{
		PLANET,MOON,DWARF_PLANET
	}
	
	
	
	
	public HeavenlyBody(String name,double orbitalperiod,BodyTypes bodyType) {

		this.orbitalPeriod = orbitalperiod;
		this.satellites = new HashSet<>();
		key = new Key(name,bodyType);
		
	}

	

	
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Key getKey() {
		return key;
	}

	public boolean addSatellite(HeavenlyBody satellite) {
		return this.satellites.add(satellite);
		
	}
	
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	
	@Override
	public final boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
			HeavenlyBody objBody = (HeavenlyBody) obj;
			
			return this.key.equals(objBody.key);
			
		}
	
		return false;
	}


	
	@Override
	public final int hashCode() {
		return this.key.hashCode();
	}





	@Override
	public String toString() {
		return this.key.name + ": "+this.key.bodyType + ", "+ this.orbitalPeriod;
	}




	public static Key makeKey(String name,BodyTypes bodyType) {
		return new Key(name, bodyType);
	}


	public static final class Key{
		private String name;
		private BodyTypes bodyType;
		
		
		private Key(String name, BodyTypes bodtypes) {
			this.name = name;
			this.bodyType = bodtypes;
		}
		
		

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}
		
		

		@Override
		public final int hashCode() {
			return this.name.hashCode() + this.bodyType.hashCode() + 45;
		}
		
		@Override
		public final boolean equals(Object obj) {
			
			if(this == obj) {
				return true;
			}
			
			if(obj instanceof Key) {
				Key objKey = (Key) obj;
				
				if(this.name.equals(objKey.name)) {
					return this.bodyType == objKey.bodyType;
				}	
			}
			
			return false;
		}



		@Override
		public String toString() {
			return name + ": " + bodyType;
		}
		

		
	}
	
	
	
}



