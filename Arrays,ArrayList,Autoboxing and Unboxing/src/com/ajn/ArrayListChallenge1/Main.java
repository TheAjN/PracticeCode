package com.ajn.ArrayListChallenge1;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("9900457009");
	
	public static void main(String[] args) {

		int choice;
		boolean quit = false;
		startPhone();
		printInstructions();
		while (!quit) {
			System.out.println("Enter your option (6 to show available options) = ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 0:
				System.out.println("Shutting down..");
				quit = true;
				break;
			case 1:
				printContact();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContact();
				break;
			case 6:
				printInstructions();
				break;
			}

		}
	}
	
	private static void startPhone() {
		System.out.println("Starting Phone.........");
	}
	
	private static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To shutdown.");
		System.out.println("\t 1 - To print the list of Contact.");
		System.out.println("\t 2 - To add an Contact.");
		System.out.println("\t 3 - To update an existing contact.");
		System.out.println("\t 4 - To remove a contact.");
		System.out.println("\t 5 - To search a contact.");
		System.out.println("\t 6 - To print choice options.");
	}
	
	private static void printContact() {
		mobilePhone.printContact();
	}
	
	private static void addContact() {
		System.out.println("Enter name of the contact = ");
		String name = scanner.nextLine();
		System.out.println("Enter contact number = ");
		String num = scanner.nextLine();
//		Contacts contact = new Contacts(name,num);
		
		Contacts contact = Contacts.createContactRecord(name, num); 
		/* the above line, createContactRecord(name, num); is called via Contacts
		class and not through an object, because this method is a static method */
	
			if(mobilePhone.addContact(contact)) {
				System.out.println("New contact " + contact.getName() + " is added");
													//name
			}else {
				System.out.println("Contact "+name+" "+num +
						" is already present in the file");
			}
	
	}
	
	private static void updateContact() {
		System.out.println("Enter the existing contact name = ");
		String name = scanner.nextLine();
//		System.out.println("Enter contact number to update = ");
//		String num = scanner.nextLine();
		
		Contacts existingContact  = mobilePhone.queryContact(name);
		
		if(existingContact!= null) {
			System.out.println("Enter new contact name = ");
			String newname = scanner.nextLine();
			System.out.println("Enter new contact number = ");
			String newnum = scanner.nextLine();
			
			Contacts newContact  = Contacts.createContactRecord(newname, newnum);
			
			if(mobilePhone.updateContact(existingContact, newContact)) {
				System.out.println("Sucessfully updated record");
				
			}else {
				System.out.println("Error updating record");
			}
			
		}else {
			System.out.println("Existing contact "+name+" is not found");
			
		}	
	}
	
	private static void removeContact() {
		System.out.println("Enter the contact name to remove= ");
		String name = scanner.nextLine();
		
		Contacts existingContact  = mobilePhone.queryContact(name);
		
		if(existingContact!= null) {
			
			if(mobilePhone.removeContact(existingContact)) {
				System.out.println("Contact "+name+" Sucessfully removed");
			}else {
				System.out.println("Error removing record");
			}	
		}else {
			System.out.println("Contact "+name+" does not exist");
		}
	}
	
	
	private static void findContact() {
		System.out.println("Enter the contact name to search = ");
		String name = scanner.nextLine();
		
		Contacts existingContact  = mobilePhone.queryContact(name);
		
		if(existingContact!=null) {
			System.out.println("Name = "+existingContact.getName()
			+"\n"+"Contact number =  "	+ existingContact.getNumber());
		}else {
			System.out.println("Contact "+name+" does not exist");
		}
	}
	
	
}
