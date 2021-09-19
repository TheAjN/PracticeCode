package com.ajn.SetsHashSetsBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
	
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		
		for (int i = 1; i <= 100; i++) {
			squares.add(i*i);
			cubes.add(i*i*i);
		}

		System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes.");
		
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		
		System.out.println("Union contains " +union.size()+" elements");
		
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes); //removes all elements in interection object
										//that are different from cube object
		
		System.out.println("Intersection  contains "+intersection.size());
		
		for (Integer i : intersection) {
			System.out.println( i+ " is a square of "+ Math.sqrt(i) + " and cube of "+ Math.cbrt(i));
		}
		
		
		Set<String> words = new HashSet<>();
		String sentence = "This is a set";
		
		String[] arraywords = sentence.split(" ");
		
//		for (String s : arraywords) {
//			words.add(s);
//		}
		
		words.addAll(Arrays.asList(arraywords));
	
		for (String s : words) {
			System.out.println(s);
		}
		
		Set<String> nature = new HashSet<String>();
		Set<String> divine = new HashSet<String>();
		
		String[] naturewords = {"all","nature","is","but","art","unknown","to","thee"};
		String[] divinewords = {"to","err","is","human","to","forgive","divine"};
		
		nature.addAll(Arrays.asList(naturewords));
		divine.addAll(Arrays.asList(divinewords));
		
		
		System.out.println("nature - divine:");
		Set<String> set1 = new HashSet<>(nature);
		set1.removeAll(divine);
		printSet(set1);
		
		System.out.println("divine - nature:");
		Set<String> set2 = new HashSet<>(divine);
		set2.removeAll(nature);
		printSet(set2);	
		
		
		System.out.println("(divine + nature) - to,is  (Symmetric difference)");
		Set<String> unionTest = new HashSet<>(nature);
		Set<String> intersectionTest = new HashSet<>(nature);
		unionTest.addAll(divine); //union
		intersectionTest.retainAll(divine); //intersection
		
		unionTest.removeAll(intersectionTest); //Asymmetric
		
		printSet(unionTest);
		
		if(nature.containsAll(divine)) {
			System.out.println("divine is a subset of nature");
		}
		
		if(nature.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is a subset of nature");
		}
		
		if(nature.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is a subset of divine");
		}
	}
	
	private static void printSet(Set<String> set) {
		for (String s : set) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	
	
}
