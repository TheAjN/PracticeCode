package com.ajn.ArraylistIntro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static GroceryList groceryList = new GroceryList();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

//		groceryList.groceryItem("bananas");
//		groceryList.groceryItem("Sugar");
//		groceryList.groceryItem("Onions");
//		groceryList.groceryItem("Detergent");
//
//		groceryList.printGroceryList();
//
//		groceryList.modifyGroceryItem(3, "Chillis");
//
//		groceryList.printGroceryList();
//
//		System.out.println(groceryList.findGroceryItem("sugar"));
		int choice;
		boolean quit = false;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your Choice = ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				processArrayList();
				break;
			case 7:
				quit = true;
				break;
			}

		}
	}

	private static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addItem() {
		System.out.println("Enter the item name = ");
		groceryList.groceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.println("Enter the existing item name = ");
		String item = scanner.nextLine();
		System.out.println("Enter the new item name = ");
		String item2 = scanner.nextLine();
//		System.out.println("Enter Position = ");
//		int pos = scanner.nextInt();
//		scanner.nextLine();

		//groceryList.modifyGroceryItem(pos-1, item);
		groceryList.modifyGroceryItem(item,item2);
		
	}

	public static void removeItem() {
		System.out.println("Enter the item to be removed = ");
		String item = scanner.nextLine();
		if (groceryList.onFile(item)) {
//			System.out.println("Enter Position of that item = ");
//			int pos = scanner.nextInt();
//			scanner.nextLine();
			groceryList.removeGroceryItem(item);
		}

	}

	public static void searchItem() {
		System.out.println("Enter the item to be searched = ");
		String item = scanner.nextLine();
		if (groceryList.onFile(item)) {
			System.out.println(item + " is present." );
		}else {
			System.out.println(item + " is not found in the Grocery List");
		}
	}
	
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGrocerylist());
		
		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGrocerylist());
		//nextArray is created with the contents of the groceryList ArrayList
		
		String[] StringArray = new String[groceryList.getGrocerylist().size()];
		StringArray = groceryList.getGrocerylist().toArray(StringArray);
		
		
	}
}
