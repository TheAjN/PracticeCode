package com.ajn.ArrayListExercise;

import java.util.ArrayList;


public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts = new ArrayList<Contact>();

	public MobilePhone(String number) {

		this.myNumber = number;
		this.myContacts = myContacts;
	}

	public boolean addNewContact(Contact newContact) {

		int test = findContact(newContact.getName()) ;

		if (test< 0) {
			myContacts.add(newContact);
			
			return true;
		}
		return false;
	}
	
	public boolean updateContact(Contact existingContact, Contact newContact) {

		if (findContact(existingContact) < 0) {
			return false;
		}else if(findContact(newContact.getName())!=-1){
			return false;
			
		}
		
		int pos = myContacts.indexOf(existingContact);
		myContacts.set(pos, newContact);
		return true;
	}
	
	public boolean removeContact(Contact contact) {
		
		if(findContact(contact)<0) {
			return false;
		}
		myContacts.remove(myContacts.indexOf(contact));
			return true;
	}
	
	public Contact queryContact(String name) {
		
		int pos = findContact(name);
		if(pos>=0) {
			return this.myContacts.get(pos);
		}
		
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact List:");
		for (int i = 0; i < myContacts.size(); i++) {
			System.out.println(	(i + 1)+". "+myContacts.get(i).getName() + " -> " 
		+ myContacts.get(i).getPhoneNumber());
		}
	}
	
	private int findContact(String name) {

		for (int i = 0; i < myContacts.size(); i++) {
			Contact contact = myContacts.get(i);
			if (contact.getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}

	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	
}
