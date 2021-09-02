package com.ajn.AbstractClassBasics;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is pecking");
	}


	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" Breathe in, breathe out ");
	}

//	public abstract void fly(); 			//not all birds can fly, so the fly() is abstract
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is flapping its wings");
	}


	
	
	
}
