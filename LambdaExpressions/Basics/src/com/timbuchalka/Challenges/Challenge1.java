package com.timbuchalka.Challenges;


import java.util.function.Function;
import java.util.function.Supplier;

public class Challenge1 {
    public static void main(String[] args) {

        //Question 1 - convert this code into lambda expression
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");

                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        //Answer 1
        Runnable runnableAns = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");

            for (String part : parts) {
                System.out.println(part);
            }
        };

        new Thread(runnableAns).start();

        System.out.println("=========================");

        //Question 2 o/p
        System.out.println(everySecondChar("Hello there Question 2"));

        //Answer 2
        Function<String, String> stringOp = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(stringOp.apply("Hello there Answer 2"));

        //Question 3 - execute Answer 2
        //Answer 3 - the line below is the answer
        System.out.println(stringOp.apply("1234567890"));

        //Question 5 - Call the method of Answer 4 and add stringOps and the numbers as parameter
        //Answer 5 - code below
        System.out.println(everySecondCharacter(stringOp, "1234567890AJN"));

        //Question 6 - Write a lambda expression that maps to the java.util.Supplier interface
        //Answer code below -
        Supplier<String> iLoveJava = () -> "I love Java";

        //Question 7 - Use Supplier to assign a iLoveJava
        // which returns "I love Java!" to a variable called supplierResult
        //Answer 7 -
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }

    //Question 2 - convert this code into lambda expression
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }


    //Question 4 - Write a method that accepts Function<T,R> as a parameter
    //Answer 4 - below code
    public static String everySecondCharacter(Function<String, String> func, String input) {
        return func.apply(input);
    }

}
