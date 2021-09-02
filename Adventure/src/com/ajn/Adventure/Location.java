package com.ajn.Adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {

	private final int locationID;			//why final? because we dont want to change their values
											//once the constructor is done creating a Location instance
	private final String description;
	private final Map<String, Integer> exits;  //directions to be more specific (East, West, North, South)
	
	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<>();
		this.exits.put("Q", 0);
	}

	public void addExit(String description,int location) {
		exits.put(description, location);
	}
	
	
	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<>(exits);	//returns a copy of exits field rather than exits itself, 
										//so that outside of this class one cant change the exits field
	}
	
	
	
	
}
