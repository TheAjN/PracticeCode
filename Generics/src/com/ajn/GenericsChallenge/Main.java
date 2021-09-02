package com.ajn.GenericsChallenge;

public class Main {

	public static void main(String[] args) {
		
	     // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.
		
//		BasketBallTeam lakers = new BasketBallTeam("Lakers");
//		BasketBallTeam mheat = new BasketBallTeam("Miami Heat");
//		BasketBallTeam gtw = new BasketBallTeam("Golden State Warriors");
//		
		Team<FootballPlayer> tothotspur = new Team<>("Totanham Hotspur");
		Team<FootballPlayer> mancity = new Team<>("Manchester City");
		Team<FootballPlayer> liverpool = new Team<>("Liverpool");
		
//		CricketTeam rcb = new CricketTeam("RCB");
//		CricketTeam csk = new CricketTeam("CSK");
//		CricketTeam mi = new CricketTeam("Mumbai Indians");
		
		League<Team<FootballPlayer>> premierLeague = new League<>("Premier League");
		
		premierLeague.addTeam(tothotspur);
		premierLeague.addTeam(liverpool);
		premierLeague.addTeam(mancity);
	//	premierLeague.addTeam(mancity);
		
		mancity.matchResult(tothotspur, 2, 1); 
		liverpool.matchResult(mancity, 3, 5);
		tothotspur.matchResult(liverpool, 1, 4);
		tothotspur.matchResult(mancity, 3, 2);
		
		premierLeague.listTeams();
		
	}

}
