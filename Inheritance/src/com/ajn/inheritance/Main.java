package com.ajn.inheritance;

public class Main extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal=new Animal("Animal", 1, 1, 1, 5);
		
		Dog Yorkie= new Dog("Yorkie", 7, 20, 4, "fur", 2, 1, 36);
		
		Yorkie.eat();
		Yorkie.walk();
		Yorkie.run();
		
		Yorkie.move(6);
		
//		Fish popy = new Fish("Popy", 3, 3, 2, 2, 4);
//		
//		popy.eat();
//		
//		popy.swim(40);
//		
//		popy.chill();
		
	}
}
