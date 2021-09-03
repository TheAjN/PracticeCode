package com.ajn.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
	
	public static void main(String[] args) {
		
		// Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
		
		
	Scanner scanner = new Scanner(System.in);

	 locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
     locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
     locations.put(2, new Location(2, "You are at the top of a hill"));
     locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
     locations.put(4, new Location(4, "You are in a valley beside a stream"));
     locations.put(5, new Location(5, "You are in the forest"));

     locations.get(1).addExit("W", 2);	//ROAD
     locations.get(1).addExit("E", 3);
     locations.get(1).addExit("N", 5);
     locations.get(1).addExit("S", 4);
   //  locations.get(1).addExit("Q", 0);
     
     locations.get(2).addExit("N", 5);	//HILL
 //   locations.get(2).addExit("Q", 0);
     
     locations.get(3).addExit("W", 1);	//BUILDING
  //   locations.get(3).addExit("Q", 0);
     
     locations.get(4).addExit("N", 1);	//VALLEY
     locations.get(4).addExit("W", 2);
  //   locations.get(4).addExit("Q", 0);
     
     locations.get(5).addExit("S", 1);	//FOREST
     locations.get(5).addExit("W", 2);
//     locations.get(5).addExit("Q", 0);
       
     Map<String, String> vocabulary = new HashMap<>();
     
     vocabulary.put("NORTH","N");
     vocabulary.put("SOUTH", "S");
     vocabulary.put("EAST", "E");
     vocabulary.put("WEST", "W");
     vocabulary.put("QUIT", "Q");
     
     
     int loc =1;
     while(true) {
    	 
    	System.out.println(locations.get(loc).getDescription());
    	 if(loc==0) {
    		 break;
    	 }
    	 
    	 Map<String, Integer> exits = locations.get(loc).getExits();
    	 System.out.println("Available Exits are = ");
    	 for (String exit : exits.keySet()) {
			System.out.print(exit + ", ");
		}
    	 System.out.println();
    	 
    	 
    	 
    	 String sentence = scanner.nextLine().toUpperCase();  // E, W, N, S, Q
//    	 
//    	 String[] directions = sentence.split(" ");
//    	 
//    	 String finaldirection = null;
//    	 
//    	 for (String direction : directions) {
//    		 direction = direction.toUpperCase();
//
//    		 switch(direction){
//			
//    		 case "NORTH": 
//    			 finaldirection = "N";
//    			 break;
//    		 case "SOUTH":
//    			 finaldirection = "S";
//    			 break;
//    		 case "EAST":
//    			 finaldirection = "E";
//    			 break;
//    		 case "WEST":
//    			 finaldirection = "W";
//    			 break;
//    		 case "N":
//    			 finaldirection = direction;
//    			 break;
//    		 case "S":
//    			 finaldirection = direction;
//    			 break;
//    		 case "W":
//    			 finaldirection = direction;
//    			 break;
//    		 case "E":
//    			 finaldirection = direction;
//    			 break;
//    		 case "QUIT":
//    			 finaldirection = "Q";
//    			 break;
//    		 case "Q":
//    			 finaldirection = direction;
//    			 break;
//    			 
//				
//			}
//		}
    	 
    	 if(sentence.length()>1) {
    		 
        	 String[] directions = sentence.split(" ");
        	 
        	 for (String direction : directions) { 
        		 if(vocabulary.containsKey(direction)) {
        			 sentence = vocabulary.get(direction);
        			 break;
        		 }
        	 }
    		 
    	 }
    	 
    	 if(exits.containsKey(/*finaldirection*/ sentence )) {
    		 loc = exits.get(/*finaldirection*/ sentence);
    	 }else {
    		 System.out.println("You can't go in that direction");
    	 }
    	 
    //	 if(!locations.get(loc).getExits().containsKey(direction)) {
    	 
   //		 System.out.println("You can't go in that direction");
   // 	}
    	 
  //  	 loc = locations.get(loc).getExits().get(exit);
    	 
     }
	}

}
