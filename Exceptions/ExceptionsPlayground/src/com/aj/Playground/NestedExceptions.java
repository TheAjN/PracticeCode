package com.aj.Playground;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NestedExceptions {

    static Scanner sc = new Scanner(System.in);

   public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        try {
            nestedTry(args);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e + " Outer try catch() block called");
        }

    }


 static void nestedTry(String[] args) {
        try {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(ANSI_CYAN +"No exceptions within the inputs only on args");
            args[45] = "89";


            a = 0;
            b = b / a;


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " Inner try catch() block called");
        }

    }
}
