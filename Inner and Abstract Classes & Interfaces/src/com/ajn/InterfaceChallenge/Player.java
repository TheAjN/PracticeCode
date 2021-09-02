package com.ajn.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	
	
	public Player(String playername, int health, int strength) {
		this.name = playername;
		this.hitPoints = health;
		this.strength = strength;
		this.weapon = "Sword";
	}

	
	
	public void setName(String playername) {
		this.name = playername;
	}



	public void setHitPoints(int health) {
		this.hitPoints = health;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}



	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}



	public String getName() {
		return name;
	}


	public int getHitPoints() {
		return hitPoints;
	}


	public int getStrength() {
		return strength;
	}


	public String getWeapon() {
		return weapon;
	}


	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> player = new ArrayList<String>();
		
		player.add(0,name);
		player.add(1,Integer.toString(hitPoints));
		player.add(2,""+ strength);
		player.add(3,weapon);
		
		return player;
	}

	@Override
	public void read(List<String> data) {
		
		if(data== null  && data.size()<0) {
			System.out.println("No data present");
			return;
		}
		
		this.name = data.get(0);
		this.hitPoints = Integer.parseInt(data.get(1));
		this.strength = Integer.parseInt(data.get(2));
		this.weapon = data.get(3);
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Player{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon=" + weapon
				+ "}";
	}



}
