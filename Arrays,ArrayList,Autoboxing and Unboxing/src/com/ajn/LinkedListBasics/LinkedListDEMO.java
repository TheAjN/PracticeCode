package com.ajn.LinkedListBasics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class LinkedListDEMO {
	
	public static void main(String[] args) {
		
		LinkedList<String> placeStrings = new LinkedList<String>();
		InOrder(placeStrings, "Bailur");
		InOrder(placeStrings, "Karkala");
		InOrder(placeStrings, "Kudla");
		InOrder(placeStrings, "Goa");
		InOrder(placeStrings, "Mumbai");
		InOrder(placeStrings, "Delhi");
//		placeStrings.add("Karkala");
//		placeStrings.add("Udupi");
//		placeStrings.add("Kudla");
//		placeStrings.add("Goa");
//		placeStrings.add("Kasol");
//		placeStrings.add("Gokarna");
		
		printList(placeStrings);
		
		InOrder(placeStrings, "Bangalore");
		InOrder(placeStrings, "Karkala");
		
		printList(placeStrings);
		visit(placeStrings);
//		placeStrings.add(2, "Kheerganga");
		
//		printList(placeStrings);
//		
//		placeStrings.remove(4);
//		
//		printList(placeStrings);
	}
	
	
	private static void printList(LinkedList<String> placeStrings) {
//		for (int i = 0; i < placeStrings.size(); i++) {
//			System.out.println(placeStrings.get(i));
//		}
		
		Iterator<String> i = placeStrings.iterator();
		
		while(i.hasNext()) {
			System.out.println("Now visitng : "+ i.next());
		}
		System.out.println("===============");
		
	}
	
	
	private static boolean InOrder(LinkedList<String> linkedList, String newCity) {
		
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparsion = stringListIterator.next().compareTo(newCity);
			
			if(comparsion==0) {
				
				//The string value in newCity already exists,therefore do not add
				
				System.out.println(newCity + " is already included in the destination");
				return false;
			}else if (comparsion>0) {
				//newCity should come before, since the first character
				//in the string of the stringListiterator is greater than newCity's string
				
				stringListIterator.previous(); //since we have used .next() to retrieve the element,
												// the pointer/iterator is pointing to the next 
												// element, therefore we use .previous() to point the
												//the iterator back to the initial element
				
				stringListIterator.add(newCity);
				return true;
			}else if (comparsion<0) {
				//move on to the next city
			}
		}
		
		stringListIterator.add(newCity);
		//This  line will be executed when the String element is the last one at an alphabetical order
		//eg - if "Warangal" String is present in newCity, it would be added last.
		
		return true;
	}
	
	
	private static void visit(LinkedList<String> place) {
		
		Scanner scanner = new java.util.Scanner(System.in);
		
		boolean quit = false;
		boolean goingforward = true;
		ListIterator<String> iterator = place.listIterator();
		
		if(place.isEmpty()) {
			System.out.println("No places found in the iternary");
			return;
		}else {
			System.out.println("Now visiting " +  iterator.next());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
				
			case 0:
				System.out.println("Holiday is over");
				quit=true;
				break;
			
			case 1:
				if(!goingforward) {
					if(iterator.hasNext()) {
						iterator.next();
					}
					goingforward = true;
				}
				
				if(iterator.hasNext()) {
					System.out.println("Now visiting " + iterator.next());	
				}else {
					System.out.println("Reached the end of our list");
					goingforward = false;
				}
				break;
				
			case 2:
				if(goingforward) {
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
					goingforward = false;
				}
				if(iterator.hasPrevious()) {
					System.out.println("Now visiting " + iterator.previous());	
				}else {
					System.out.println("Reached the begining of our list");
					goingforward = true;
				}
				break;
				
			case 3:
				printMenu();
				break;
			}
			
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - To quit \n"
				+ "1 - Go to next city \n"
				+ "2 - Go to previous city \n"
				+"3 - Print menu");
	}
	
	
}
