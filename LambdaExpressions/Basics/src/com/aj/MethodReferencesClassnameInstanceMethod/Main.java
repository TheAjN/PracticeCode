package com.aj.MethodReferencesClassnameInstanceMethod;

interface myFunc<T> {
    boolean func(T t, T v);
}

class HighTemp {

    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp h1) {
        return this.hTemp == h1.hTemp;
    }

    boolean lessThanTemp(HighTemp h2) {
        return this.hTemp < h2.hTemp;
    }
}

public class Main {

    public static <T> int counter(T[] values, myFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (f.func(v, values[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int countEqual;
        int countlessThan;
        HighTemp[] temps = {new HighTemp(99), new HighTemp(140), new HighTemp(90),
                new HighTemp(90), new HighTemp(99), new HighTemp(78),
                new HighTemp(69), new HighTemp(90), new HighTemp(140)};

        //Example of ContainingType::InstanceMethodName
        countEqual = counter(temps,HighTemp::sameTemp,new HighTemp(90));

        countlessThan = counter(temps,HighTemp::lessThanTemp, new HighTemp(90));


        System.out.println(countEqual);
        System.out.println(countlessThan);
    }

}