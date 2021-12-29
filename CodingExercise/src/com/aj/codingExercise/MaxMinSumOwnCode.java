package com.aj.codingExercise;

import java.util.ArrayList;
import java.util.List;

public class MaxMinSumOwnCode {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);arr.add(5);arr.add(5);arr.add(5);arr.add(5);

        MaxMinSumOwnCode.minMaxSumOwnCode(arr);
    }

    public static void minMaxSumOwnCode(List<Integer> arr) {
        long minTotal = 0, maxTotal = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (findMax(arr) == findMin(arr) || arr.get(i-1).equals(arr.get(i))) {
                System.out.println("test "+i);
                minTotal += arr.get(i);
                maxTotal += arr.get(i);
                if (i > 2) {
                    break;
                }
            }else {
                if (arr.get(i) != findMax(arr)) {
                    minTotal += arr.get(i);
                }

                if (arr.get(i) != findMin(arr)) {
                    maxTotal += arr.get(i);
                }
            }

        }
        System.out.println(maxTotal + " " + minTotal);
    }

    public static long findMax(List<Integer> arr){
        long max = 0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>max){
                max= arr.get(i);
            }
        }
        return max;
    }

    public static long findMin(List<Integer> arr){
        long min= findMax(arr);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min= arr.get(i);
            }
        }
        return min;
    }

}
