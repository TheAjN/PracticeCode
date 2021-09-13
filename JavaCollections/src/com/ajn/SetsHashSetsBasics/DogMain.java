package com.ajn.SetsHashSetsBasics;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Labrador rover = new Labrador("Rover");
		Dog rover2 = new Dog("Rover");
		
		System.out.println(rover.equals(rover2)); // returns false(if equals method is present in labrador)
		System.out.println(rover2.equals(rover));	//returns true
		
		//Since this violates the assymmetric rule of equals() method since both the scenario should return true
		//The one ay to fix this is to remove the Overridden equals method in labrador
	}

}
