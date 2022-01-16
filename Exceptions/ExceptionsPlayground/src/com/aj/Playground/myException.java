package com.aj.Playground;

public class myException extends Exception{

    private String info="field 'info' here!";

    myException(){
        System.out.println("myException called, value = "+info);
    }

    myException(String information){
        System.out.println("myException called with info"+information);
    }

    @Override
    public String toString() {
        return "myException{" +
                "info=" + info +
                '}';
    }
}

