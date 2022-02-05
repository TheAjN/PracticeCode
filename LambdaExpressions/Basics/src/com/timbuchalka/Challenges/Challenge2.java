package com.timbuchalka.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge2 {
    public static void main(String[] args) {

        //Challenge 9 - Make the first letter of the name uppercase and sort them in their natural order
        //using lambda expressions
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        //My solution
        //Also the answer for converting Tim's solution code into stream
        topNames2015.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println();

        //Tim's solution
        List<String> op = new ArrayList<>();
        topNames2015.forEach(s -> op.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        op.sort((s1, s2) -> s1.compareTo(s2));
        op.forEach(s -> System.out.println(s));

        //Question 10 - Convert the above code by using method references
        System.out.println();

        List<String> opMethodReference = new ArrayList<>();
        topNames2015.forEach(s -> opMethodReference.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        opMethodReference.sort(String::compareTo);
        opMethodReference.forEach(System.out::println);

        System.out.println();

        //Question 12 - print out names that begin with letter "A"
        //Solution
        List<String> letterA = new ArrayList<>(topNames2015);
        System.out.println(letterA.stream()
                .filter(s -> s.startsWith("A"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .count());

        System.out.println("final o/p");
        List<String> Nameswith1stlettercap = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(s->s.startsWith("O"))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());


        System.out.println(Nameswith1stlettercap);
    }
}
