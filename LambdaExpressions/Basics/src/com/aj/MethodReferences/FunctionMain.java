package com.aj.MethodReferences;


import java.util.function.Function;


class SimpleObj {
    private String name;
    private Integer num;

    public SimpleObj(Integer num) {
        this("AJN", num);
    }

    public SimpleObj(String name, Integer num) {
        this.name = name;
        this.num = num;
    }


    @Override
    public String toString() {
        return "SimpleObj{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}

//Found this way of implementation in the company code, thought of trying this way of using functional interfaces
class FunctionClass {

    //Integer is input, SimpleObj is output
    Function<Integer, SimpleObj> scopeGenerator() {

        //Method reference Classname::new is used, where a new instance of Function
        //is returned when getScopeGenerator() is called
        return SimpleObj::new;
    }

}

public class FunctionMain {


    public static void main(String[] args) {
        SimpleObj obj = new FunctionClass().scopeGenerator().apply(20);
        System.out.println(obj);
    }




}