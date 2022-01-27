package com.aj.lambdaAsAnArgument;

//Lambda Expression within method parameters


interface stringWork {
    public abstract String stringFunc(String str);
}


public class LambdaAsAnArgument {

    public static String assignString(stringWork stringWork, String st) {
        return stringWork.stringFunc(st);
    }

    public static void main(String[] args) {

        String str = "my name is  abhishek";

        String allUpperCase_nospaces = assignString(
                (inputString) -> {
                    String[] onlywords = inputString.split(" ");
                    StringBuffer sb = new StringBuffer();
                    for (String s : onlywords) {
                        sb.append(s);
                    }
                    sb.reverse();
                    return String.valueOf(sb).toUpperCase();

                }, str);

        System.out.println(allUpperCase_nospaces);

    }

}

