package com.ajn.ArrayListChallenge1;


import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

	
	
	public MobilePhone(String number) {
		
		this.myNumber=number;
		this.contacts = contacts;
	}

	public void printContact() {
		System.out.println("List of all the Contacts name = ");
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(
					(i + 1) + ". Name = " + contacts.get(i).getName() + ", Number = " + contacts.get(i).getNumber());
		}
	}

	public boolean addContact(Contacts newContact) {
//		if(!contacts.contains(newContact)) {
//			contacts.add(newContact);
//			System.out.println("New contact " + newContact.getName() + " is added");
//			return true;
//		}
		int test = findContact(newContact.getName()) ;
		System.out.println(test);

		if (test< 0) {
			contacts.add(newContact);
			
			return true;
		}
		return false;
	}

	public boolean updateContact(Contacts existingContact, Contacts newContact) {

		if (findContact(existingContact) < 0) {
			System.out.println(existingContact.getName() + " is not found.");
			return false;
		}else if(findContact(newContact.getName())!=-1){
			System.out.println("Contact with name "+ 
		newContact.getName()+" already exists. Update not sucessful");
			return false;
			
		}
		
//		for(int i=0; i<contacts.size(); i++) {
//			if(newContact.getName().equals(contacts.get(i).getName())) {
//				System.out.println("Contact "+contacts.get(i).getName()+" already Exists");
//				return false;
//			}
//		}
		int pos = contacts.indexOf(existingContact);
		contacts.set(pos, newContact);
		System.out.println("The old contact " + existingContact.getName() + " is updated to  Name = "
				+ newContact.getName() + ", Number = " + newContact.getNumber());
		return true;
	}

	public boolean removeContact(Contacts contact /* String name */) {

//		for (int i = 0; i < contacts.size(); i++) {
//			if (contacts.get(i).getName() != null) {
//				System.out.println("Contact " + contacts.get(i).getName() + " is removed");
//				contacts.remove(i);
//				break;
//			}
//		}
		if(findContact(contact)<0) {
			System.out.println("Contact " +contact.getName()+" doesn't exist ");
			return false;
		}
		
//		Contacts removedContact = new Contacts();
//		removedContact = contact;
//		if (contacts.contains(contact)) {
			contacts.remove(contacts.indexOf(contact));
			System.out.println("Contact " + /*removedContact.getName()*/ 
			contact.getName() + " is removed");
			return true;
//		} 
		
	
	}


	public String queryContact(Contacts contact) {
			
//			if(contacts.contains(contact)) {
//				
//				System.out.println("Contact "+contact.getName()+" is available");
//				return contact;
//			}
		
		
			if(findContact(contact)>=0) {
				return contact.getName();
			}
			
			return null;
		}

	public Contacts queryContact(String name) {
	
		int pos = findContact(name);
		if(pos>=0) {
			return this.contacts.get(pos);
		}
		
		return null;
	}

	private int findContact(String name) {

		for (int i = 0; i < contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if (contact.getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}

	private int findContact(Contacts contact) {
		return this.contacts.indexOf(contact);
	}

}

