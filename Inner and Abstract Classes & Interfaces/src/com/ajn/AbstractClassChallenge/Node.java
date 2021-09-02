package com.ajn.AbstractClassChallenge;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	ListItem next() {
		// TODO Auto-generated method stub
		return this.rightLink;
	}

	@Override
	ListItem setNext(ListItem item) {
		// TODO Auto-generated method stub
		this.rightLink = item;
		return this.rightLink;
	}

	@Override
	ListItem previous() {
		// TODO Auto-generated method stub
		return this.leftLink;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		// TODO Auto-generated method stub
		this.leftLink = item;
		return this.leftLink;
	}

	@Override
	public int compareTo(ListItem listItem) {
		// TODO Auto-generated method stub
		if(listItem!=null) {
			return ((String) super.getValue()).compareTo((String) listItem.getValue());
		}
		
		return -1;
		
	}
	
	

}
