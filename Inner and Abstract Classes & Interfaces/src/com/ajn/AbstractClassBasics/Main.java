package com.ajn.AbstractClassBasics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Barkor");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Green talking parrot");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
		
	}

}
