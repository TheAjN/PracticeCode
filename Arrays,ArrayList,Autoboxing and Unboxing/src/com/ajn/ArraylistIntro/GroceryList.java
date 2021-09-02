package com.ajn.ArraylistIntro;

import java.util.ArrayList;

public class GroceryList {

//	private int[] myNumbers = new int[5];
	private ArrayList<String> grocerylist = new ArrayList<String>();

	
	
	public ArrayList<String> getGrocerylist() {
		return grocerylist;
	}

	public void groceryItem(String item) {
		grocerylist.add(item);
	}

	public void printGroceryList() {
		System.out.println("There are " + grocerylist.size() 
		+ " item present " + "in the Grocery List");

		for (int i = 0; i < grocerylist.size(); i++) {
			System.out.println((i + 1) + ". " + grocerylist.get(i));
		}
	}

	private void modifyGroceryItem(int pos, String item) {
		String existingItem= grocerylist.get(pos);
		System.out.println("Grocery Item " + existingItem + " will be modifed....");
		grocerylist.set(pos, item);
		System.out.println("Grocery Item " + existingItem + " has been modified to item " + item);
	}

	public void modifyGroceryItem(String currentItem,  String item) {
		if(findposItem(currentItem)>=0) {
//			grocerylist.set(findposItem(item), item);
//			int pos = grocerylist.indexOf(item)+1;
//			System.out.println("Grocery Item " + item + " of position " 
//			+ pos + " has been modified");
			
			modifyGroceryItem(findposItem(currentItem), item);
		}else {
			System.out.println("Existing Item "+item+ " is not available");
		}
	}

	public void removeGroceryItem(String item) {
		if(findposItem(item)>=0) {
			grocerylist.remove(findposItem(item));

			System.out.println("Grocery Item " + item + " has been removed");
		}else {
			System.out.println("Item "+item+ " is not available");
		}
		
	}

	public String findGroceryItem(String item) {
		boolean exists = grocerylist.contains(item);
		int pos = grocerylist.indexOf(item);
		if (exists) {
			return grocerylist.get(pos);
		}

		return null;
	}

	private int findposItem(String item) {
		return grocerylist.indexOf(item);
	}
	
	public boolean onFile(String item) {
		int pos = findposItem(item);
		if(pos>=0) {
		return true;	
		}
		return false;
	}
}
