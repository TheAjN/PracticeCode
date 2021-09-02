package com.ajn.OurGenericClasses;

import java.util.ArrayList;



public class Team<T extends Player> implements Comparable<Team<T>>{   //base class

	private String name;
	
	private int played = 0;
	private int won= 0;
	private int lost = 0;
	private int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) { // this method, at one call, will be able to add BaseBall or football or Soccer player classes
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already in the team");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName()+" is picked for the team "+ this.name);
			return true;
		}
		
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent,int ourScore, int theirScore) {
		
		String message ;
		if(ourScore>theirScore) {
			message = " beat ";
			won++;
		}else if(ourScore == theirScore) {
			message= " drew with ";
			tied++;
		}else {
			message = " lose to ";
			lost++;
		}
		played++;
		
		if (opponent!= null) {
			System.out.println(this.getName() +message+ opponent.getName());
			opponent.matchResult(null,theirScore, ourScore);
		}
		
	}
	
	public int ranking() {
		return (won*2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		// TODO Auto-generated method stub
		if(this.ranking()> team.ranking()) {
			return -1;
		}else if(this.ranking()< team.ranking()) {
			return 1;
		}else {
			return 0;
		}	
	}
}
