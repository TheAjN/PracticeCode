package com.ajn.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;




public class League<T extends Team<? extends Player>> {
	
	private String Leaguename;
	private ArrayList<T> teams = new ArrayList<>();
	
	

	public League(String leaguename) {
		this.Leaguename = leaguename;
	}


	public String getLeaguename() {
		return Leaguename;
	}


	public void addTeam(T team) {
		if(teams.contains(team)) {
			System.out.println(team.getName() +" is already present");
		}else {
			teams.add(team);
			System.out.println(team.getName() +" team is now part of "+this.Leaguename);
			
		}
	}
	
	

	public void listTeams() {
		Collections.sort(teams);
		for (int i = 0; i < teams.size(); i++) {
			System.out.println(teams.get(i).getName()+" : "+teams.get(i).ranking());
		}
	}
	
//	@Override
//	public int compareTo(Team o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
	
}
