package com.aj.codingExercise;

import java.util.ArrayList;
import java.util.List;

public class numOfString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab"); strings.add("ab"); strings.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab"); queries.add("abc"); queries.add("bc");

        System.out.println(matchingStrings(strings,queries));
        System.out.println("test");
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> countQuery = new ArrayList<>();
        int value=0;
        countQuery.add(value);countQuery.add(value);countQuery.add(value);

        for(String query : queries){
            for(int i=0;i<strings.size();i++){
                if(query.equals(strings.get(i))){
                    value = countQuery.get(i);
                    value++;
                    countQuery.set(i,value);
                }
            }
        }
        return countQuery;
    }
}
