 package com.aj.codingExercise;

import java.util.HashSet;

public class StringCharRepeat {

    public static void main(String[] args) {
        String sentence = "Abishek";

        char[] chars = sentence.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for(char ch: chars) {
            set.add(ch);
        }

        if(set.size() == sentence.length()){
            System.out.println("duplicate char does not exists");
        }else{
            System.out.println("duplicate char does exist");
        }
    }
}
