package com.ajn.GenericsPlayground;




class numerics<T extends Number>{

    T val1;

    public numerics(T val1) {
        this.val1 = val1;
    }

    public T getVal1() {
        return val1;
    }

    public double multiply(numerics<?> val2){ //wild card ( ? ) is a basically a symbol to denote any type of
                                            //numberics class object to be sent in the parameter, and does not
                                            //need to be of type from which "this" object is created from

        return val1.doubleValue() * val2.getVal1().doubleValue();
    }

}




public class Main {

    public static void main(String[] args) {


        numerics<Integer> number1 = new numerics<>(5);
        numerics<Double> number2 = new numerics<>(5.232);

        System.out.println(number1.multiply(number2));
        // here, number1 is an object of type Integer but the parameter of multiply(),
        // which also takes numerics object, receives of type Double
        // This works only due to numberics<?> notation (wildcard) since it tells that the value provided
        //to the parameter will be unknown
    }
}
