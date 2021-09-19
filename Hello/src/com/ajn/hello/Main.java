package com.ajn.hello;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		
		List<Boolean> list = new ArrayList<Boolean>(); 
		list.add(true);
		list.add(Boolean.parseBoolean("FaLsE")); //the argument has to be string
		list.add(Boolean.TRUE);
		System.out.print(list.size());
//		List<Boolean> list2 = new ArrayList<>();
//		list2.add("2");
//		list2.add("6");
		System.out.print(list.get(0) instanceof Boolean); //this is will give o/p as true
		
	}
}
