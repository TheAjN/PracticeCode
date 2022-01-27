package com.aj.effectiveFinal;

interface myDemo{

    int testNum(int n);
}



public class Main {


    public static void main(String[] args) {

        //a local variable (in this case, 'k') cannot be modified within an enclosing scope of a lambda expression
        int k=10;
        myDemo demo = (n) ->{
            //k = 10; k can't be assigned to a value as well within the enclosing scope of lambda
            int j = k +n;
            n++;
          //  k++; cannot be modified since 'k' is effectively final
            j+=n;
            return j;
        };

        System.out.println(demo.testNum(5));

    }
}
