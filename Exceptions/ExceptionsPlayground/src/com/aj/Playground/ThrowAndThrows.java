package com.aj.Playground;


import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class myInstance {

    int val;
    String name;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}


public class ThrowAndThrows {

    public static Scanner scanner = new Scanner(System.in);

    //THROWS
    /*
    1. throws keyword is required only for checked exception
     and usage of throws keyword for unchecked exception is meaningless.

    2. throws keyword is required only to convince compiler
    and usage of throws keyword does not prevent abnormal termination of program.

    3. By the help of throws keyword we can provide information to the caller
    of the method about the exception., so that they can handle it*/
    public static myInstance returnInstance(String name) throws
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class clazz = Class.forName(name);

        return (myInstance) clazz.getDeclaredConstructor().newInstance();

    }

    //THROW
    public static void tryingThrows() {

        int a = scanner.nextInt();
        int b = 0;
        System.out.println("It does print before Exception is thrown ");
        throw new NullPointerException("throwing NULL POINTER");

    }

    //FINALLY block
    public static int finallycheck(String num) {

        try {
            int a = Integer.parseInt(num);
            System.out.println("throwing a exception just because i want to");
            throw new NoSuchElementException();

            //  return a;
        } catch (Exception e) {
            System.out.println("Characters in the string");
            return -1;
        } finally {      //finally block always runs before a return statement is executed
            //OR when an exception is thrown.
            //This functionality is required when we need to close a file/database
            //before a return statement/exception is executed/thrown
            System.out.println("Finally block executed");
            //   return 200;
        }
    }

    //How to block finally block
    public static int finallycheck() {
        try {
            String s = scanner.next();
            System.exit(1);     //This is prevent finally block to be executed
            return Integer.parseInt(s);
        } finally {
            System.out.println("^D or System.exit(i) doesn't block 'finally' ");
        }
    }

    //throwing a custom exception myException
    public static void testCustomException() throws myException {
        throw new myException();
    }

    public static void main(String[] args) {
        try {
            myInstance myInstance = returnInstance("HelloClass");
            tryingThrows();
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception caught = " + e);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println("Class not found Exception caught = " + e);
        }


        //catch custom Exception myException
        try {
            testCustomException();
        }catch(myException e){
            System.out.println(e);
        }


        System.out.println(finallycheck()); //System.exit(1) blocks finally
        System.out.println(finallycheck("456546"));
        System.out.println("Just a print statement");


    }
}
