package com.ajn.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<String,String> languages = new HashMap<>();

		if(languages.containsKey("Java")) {
			System.out.println("Java is already present");
		}else {
			System.out.println(languages.put("Java", "a compiled high level, OOP level, platform independent programing language"));
			// returns null, since the key "Java" is created here
			
			System.out.println("Java key with value is added sucessfully");
		}
		
		
		languages.put("Python", "an intepreteted level, OOP level, high level programing language");
		languages.put("Algol", "an algorithmc language");
		languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
		languages.put("Lisp", "There in lies Madness");
		languages.put("JS",null);
		
		
		System.out.println(languages.get("Java"));
		
		if(languages.containsKey("Java")) {
			System.out.println("Java is already present");
		}else {
			System.out.println(languages.put("Java", "This course is about Java")); //returns existing value
		}	
	//	System.out.println(languages.get("Java"));
		
		
		System.out.println(languages.putIfAbsent("JS", "Test")); //returns null if value is added, else return existing value
		
		System.out.println(languages.get("Java"));
		
		System.out.println("======================================================================");
		
		//languages.remove("Algol");
		
		if(languages.remove("Lisp", "There in lies Madness")){
			System.out.println("removal of Lisp worked");
		}else {
			System.out.println("Removal of lisp didnt work");
		}
		
	//	System.out.println(languages.replace("Algol", "STOP THE CAP!!!!"));
	//	System.out.println(languages.replace("Scala", "This will not be added"));
		
		if(languages.replace("Algol","an aalgorithmc language", "A functional programming language")) {
			System.out.println("Algol replaced");
		}else {
			System.out.println("Algol not replaced");
		}
		
		for (String key : languages.keySet()) {
			System.out.println(key + " : "+ languages.get(key));
			
		}
	}
}
