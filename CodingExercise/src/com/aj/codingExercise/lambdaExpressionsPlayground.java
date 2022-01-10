package com.aj.codingExercise;

interface interfaceTest {
    int factorialNum(int a);
}

interface  genericInterface<T>{
    T genericMethod(T t);
}

public class lambdaExpressionsPlayground {

   static interfaceTest factorial = z -> {          //the name of the abstract method will not be mentioned
                                                    //when implementing it within the instance of the functional interface
        int k = 1;
        for (int i = 1; i <= z; i++) {
            k *= i;
        }
        return k;
    };

   static genericInterface<String> gen1 = (str) ->{

       return str.toLowerCase();
   };


    public static void main(String[] args) {
        System.out.println(factorial.factorialNum(5));          //the name of the abstract method will only be used when it is called

        System.out.println(gen1.genericMethod("MAXIMUM"));

    }
}
