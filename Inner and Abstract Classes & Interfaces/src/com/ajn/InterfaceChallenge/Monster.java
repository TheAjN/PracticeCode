package com.ajn.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

	private String name;
	private int hitPoints;	
	private int strength;
	
	
	
	public Monster(String monstername, int health, int strength) {
		this.name = monstername;
		this.hitPoints = health;
		this.strength = strength;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String monstername) {
		this.name = monstername;
	}



	public int getHitPoints() {
		return hitPoints;
	}



	public void setHitPoints(int health) {
		this.hitPoints = health;
	}



	public int getStrength() {
		return strength;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}



	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> monster = new ArrayList<String>();
		
		monster.add(0, name);
		monster.add(1, ""+hitPoints);
		monster.add(2,""+strength);
	
		return monster;
	}

	@Override
	public void read(List<String> data) {
		// TODO Auto-generated method stub
		if(data== null  && data.size()<0) {
			System.out.println("No data present");
			return;
		}
		
		this.name = data.get(0);
		this.hitPoints = Integer.parseInt(data.get(1));
		this.strength = Integer.parseInt(data.get(2));
		
	}

	@Override
	public String toString() {
		return "Monster [monstername=" + name + ", health=" + hitPoints + ", strength=" + strength + "]";
	}

	
	
}
