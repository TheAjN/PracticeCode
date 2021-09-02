package com.ajn.AbstractClassChallenge;



public class MyLinkedList implements NodeList{

	private ListItem root = null;
	
	
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(ListItem newitem) {
		// TODO Auto-generated method stub
		if(this.root==null) {
			// This can be the first item "new item" that will be added to this.root
			this.root = newitem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while(currentItem!=null) {
			int comparison  = currentItem.compareTo(newitem);
			if(comparison<0) {
				// newitem is greater than currentItem, therefore move right
				
				if(currentItem.next()!= null) {
					currentItem = currentItem.next();
				}else {
					currentItem.setNext(newitem);
					newitem.setPrevious(currentItem);
					return true;
				}
				
			}else if(comparison>0) {
				//newitem is lesser than currentitem, insert before/ move left
				if(currentItem.previous()!= null) {
					currentItem.previous().setNext(newitem);
					newitem.setPrevious(currentItem.previous());
					newitem.setNext(currentItem);
					currentItem.setPrevious(newitem);
				}else {
					//node with a previous is a root
					newitem.setNext(this.root);
					this.root.setPrevious(newitem);
					this.root = newitem;
				}
			}else {
				//equal
				
				System.out.println(newitem.getValue() + " is already present, not added.");
				return false;
			}
		}
		
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}

}
