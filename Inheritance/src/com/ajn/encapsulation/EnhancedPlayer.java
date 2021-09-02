package com.ajn.encapsulation;

public class EnhancedPlayer {

	private String name;           //this is encapsulation
	private int health=100;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		
		if(health>0 && health<=100) {
			this.health = health;
		}
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}
	
	
	
	
}
