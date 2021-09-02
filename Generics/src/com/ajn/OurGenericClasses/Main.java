package com.ajn.OurGenericClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootballPlayer james = new FootballPlayer("James");
		BaseballPlayer fin = new BaseballPlayer("Fin");
		SoccerPlayer drogba = new SoccerPlayer("Drogba");
		
		SoccerPlayer hk = new SoccerPlayer("Harry Kane");
		SoccerPlayer lewandoski = new SoccerPlayer("Robert Lewandowski");
		
		Team<SoccerPlayer> psg = new Team<>("PSG");
		Team<SoccerPlayer> tothotspur = new Team<>("Totenham Hotspur");
		Team<SoccerPlayer> bayernmu = new Team<>("Bayern Munich");
//		psg.addPlayer(james);
//		psg.addPlayer(fin);
		psg.addPlayer(drogba);
		
		tothotspur.addPlayer(hk);
		
		bayernmu.addPlayer(lewandoski);
		
		System.out.println(psg.numPlayers());
		
		Team<BaseballPlayer> yankees = new Team<>("Yankees");
		yankees.addPlayer(fin);
		
//		Team<String> brokenTeam  = new Team<>("This should not work");
		
		Team<FootballPlayer> sydneyfc = new Team<>("Sydney FC");
		sydneyfc.addPlayer(james);
		
		psg.matchResult(tothotspur, 2, 2); 
		bayernmu.matchResult(psg, 3, 5);
		tothotspur.matchResult(bayernmu, 1, 4);
		tothotspur.matchResult(psg, 3, 2);
	//	psg.matchResult(yankees, 3, 2);
		
		System.out.println("Rankings");
		System.out.println(tothotspur.getName() + " : "+ tothotspur.ranking());
		System.out.println(psg.getName() + " : "+ psg.ranking());
		System.out.println(bayernmu.getName() + " : "+ bayernmu.ranking());
		
		
		System.out.println(psg.compareTo(tothotspur));
		System.out.println(psg.compareTo(bayernmu));
		System.out.println(tothotspur.compareTo(bayernmu));
	}

}
