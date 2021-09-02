package com.ajn.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player ajn = new Player("AjN", 4000, 500);
		System.out.println(ajn);
		saveObject(ajn);
	//	ajn.setHealth(9000);
	//	ajn.setWeapon("Dual guns");
		
		saveObject(ajn);
	//	loadObject(ajn);
		System.out.println(ajn);
		
		
		ISaveable vampire = new Monster("Dracula", 140000000, 5000);
		System.out.println("Strength = "+ ((Monster) vampire).getStrength()); //typecasting
		System.out.println(vampire);
		saveObject(vampire); // here vampire is automatically typecasted to class monster by Java
		
	}

	public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
	
	
	private static void saveObject(ISaveable objectToSave) {
		
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving "+objectToSave.write().get(i)+" to storage device" );
		}
		
	}
	
	
	private static void loadObject(ISaveable objectToLoad) {
		
		
		List<String> loadvalues = readValues();
		objectToLoad.read(loadvalues);
		
	}
	
	
	
	
	
}
