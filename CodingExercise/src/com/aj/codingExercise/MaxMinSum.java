package com.aj.codingExercise;

import java.util.ArrayList;
import java.util.List;

public class MaxMinSum {

    public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
        arr.add(256741038);arr.add(623958417);arr.add(467905213);arr.add(714532089);arr.add(938071625);

        MaxMinSum.miniMaxSum(arr);


    }

    public static void miniMaxSum(List<Integer> arr) {
       long sum=0;
       for(int i=0;i<arr.size();i++){
           sum+=arr.get(i);
       }
       long min = sum; //min will have maximum value & max will have minimum value
        long max = 0;
       long temp =0;

       for(int i=0;i<arr.size();i++){
           temp=sum;
           temp -=arr.get(i);
           if(temp<min){
               min=temp;
           }
           if(temp>max){
               max=temp;
           }
       }
        System.out.println(sum);
        System.out.println(max +" "+ min);
    }


}
