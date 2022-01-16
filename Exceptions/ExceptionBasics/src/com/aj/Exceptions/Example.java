package com.aj.Exceptions;

import java.util.*;

public class Example {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0, y = 0;
        try {
            int z = divide();        //To trigger InputMismatchException , type anything other than a number
                                       //To trigger a NoSuchElementException, press Ctrl+D
            System.out.println(z);
      /* }catch(Exception e){                 //Base of all Exceptions
           System.out.println(e.toString());        //Prints the thrown Exception from divide() method
           System.out.println("Unable to perform division, autopilot shutting down");*/
        } catch (NoSuchElementException | ArithmeticException e) {  //Supported in Java 7+
            //  throw new NoSuchElementException("No Input Found");
            System.out.println(e);
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    public static int divide() {
        int x, y;

       // try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + " y is " + y);
            return x / y;
    /*    } catch (
                NoSuchElementException e) {
            throw new NoSuchElementException("No Input Found");
        } catch (
                ArithmeticException e) {
            throw new ArithmeticException("Divided By Zero");
        }*/

    }


    public static int getInt() {
        System.out.println("Provide an input = ");
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please provide another input");
            }
        }
    }
}
