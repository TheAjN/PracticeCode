package com.aj.MethodReferences;

@FunctionalInterface
interface doubleInterface<T>{
    double preciseDivision(int value1, int value2);
}

class operationDivide{

    public static double minus1AndDivideInt(int a,int b){

        return (double) (a-1)/(b-1);
    }

    public double plus1DivisionInt(int a,int b){

        a++;
        b++;

        return (double) a/b;
    }

}

public class Main {

    public static <T> double stringOps(doubleInterface<T> d, int a, int b){

       return d.preciseDivision(a,b);
    }

    public static void main(String[] args) {

        int a = 14;
        int b = 5;

        operationDivide obj = new operationDivide();

       // doubleInterface doubleInterface = operationDivide::divideInt;

        //Basically the implementation of the abstract method "precisionDivision" is provided by "divideInt" method
        //from the operationDivide class, this works because the method divideInt is compatible with
        //precisionDivsion method in terms of return type and arguments
        System.out.println(stringOps(operationDivide::minus1AndDivideInt,a,b));

        //Same as above but this is method references via Instance "obj"
        System.out.println(stringOps(obj::plus1DivisionInt,a,b));

    }

}
