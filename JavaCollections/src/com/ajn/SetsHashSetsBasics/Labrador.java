package com.ajn.SetsHashSetsBasics;

public class Labrador extends Dog {

	public Labrador(String name) {
		super(name);
	}

//	@Override
//	public boolean equals(Object o) {
//		if(this == o) {
//			return true;
//		}
//		
//		if(o instanceof Labrador) {	//if o is an instance of Dog class, the return will be false, since 
//									//Dog is the superclass of Labrador and its object not an instance of Labrador
//			String objname = ((Labrador) o).getName();
//			return this.getName().equals(objname);
//		}
//		
//		return false;
//		
//	}
}
