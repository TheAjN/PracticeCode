package com.timbuchalka.streamsIMPORTANT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//STREAMS!!!
import static java.util.stream.Collectors.toList;

//.collect() is explained here as well
public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("N40", "N36", "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29", "O71");

        List<String> gNumbers = new ArrayList<>();
      /*  stringList.forEach(num -> {
            if (num.toUpperCase().startsWith("G")) {
                gNumbers.add(num);

//we can use variables declared in main in lambda expressions inside main as long as
//variables are effectively final, in this case we're changing the contents of
//gNumbers list but the object reference stored in the gNumbers variable
//doesn't change and so gNumbers is effectively final and therefore we can use it within the lambda block

                System.out.println(num);
            }
        });

        System.out.println("==================");
        gNumbers.sort((String s1,String s2) -> s1.compareTo(s2));

        gNumbers.forEach((String s) -> System.out.println(s));*/

        //The entire block of code above can be replaced with a stream, example below -

        stringList  //the collection "stringList" won't be changed when using streams
                .stream()   //replicates the object references of the collection within itself, it is stateless,
                // for example it doesnt depend on variable values on a previous step

                //the stream call is a stream that contains
                //all the items in the  "stringlist" in the same order that they occur
                //in the list

                .map(String::toUpperCase) // the "Function" interface called inside the map method accepts only one
                // parameter and returns one value, since toUpperCase method also has a
                //single parameter and it is of type String, this method reference is legit
                //NOTE - toUpperCase won't work if stringList isn't a collection of Strings
                //map returns a stream of values that is affected by the interface implemented within its parameters
                //V.V.I = contents of .stream() == contents of .map()

                .filter(s -> s.startsWith("G"))
                //within the filter argument contains a Predicate interface, which accepts one parameter,
                //but returns true or false, values contained in the result of the filter stream are the ones that
                //Predicate has returned true.In this case startsWith() accepts one parameter and returns boolean
                //which acts as an implementation to Predicate's test() method

                .sorted()
                //sorts the elements in their natural order, there also .sorted(Comparator<? super T> comparator)

                .forEach(System.out::println);
                //uses Consumer as an interface within its parameter where it takes one argument but returns void
                //therefore we use println as an implementation of the method
                // .forEach() is a terminal operation, since it doesn't return a stream, unlike the
                //above stream methods


        //the source can also be an array and I/O channel, where we can build streams from scratch

        System.out.println("===================================");
        //Creating a stream of Strings
        Stream<String> ioNumberStream = Stream.of("I26","I17","I29","O71");

        Stream<String> inNumberStream = Stream.of("N40","N36","I26","I17","I29","O71");
        Stream<String> ionNumberStream = Stream.concat(ioNumberStream,inNumberStream);
        List<String> outputOfIONNumberStream = new ArrayList<>();
        System.out.println(ionNumberStream.distinct().count());
        //distinct returns only unique elements from the source stream
        // count() is a terminal operation


        System.out.println("===================================");
        //How to print a stream without breaking the chain?Since .forEach() break th chain
        //Ans - .peek(Consumer<? super T> action) method
        //Why peek() is used? Ans- mostly for debugging purposes


        System.out.println(ionNumberStream.distinct().peek(System.out::println).count());
        //prints unique numbers from ionNumberStream and prints count


        //NOTES -
        // 1. Once an object of type "Stream<>" is closed/terminated, the same stream cannot be reused,
        // since it would cause an IllegalStateException
        //You CAN create multiple streams of Objects of type List, since streams are stateless
        //2. Intermediate operations won't bew executed until a terminal operation is called. Why?
        //because intermediate operation is lazy
        //3. You cannot re-continue an intermediate pipeline


        System.out.println("=========================");

        //.collect() concept in Stream API
        outputOfIONNumberStream = stringList.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("I"))
                .sorted()
                .collect(toList());

        outputOfIONNumberStream = stringList.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("I"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

      /*  first argument to collect is the supplier, if you recall a supplier create
        objects, now we want an arraylist so we passed the "Arraylist::new" as
        the supplier which will construct a new arraylist for us, by the way when
        passing method references we use the name of the class arraylist in this case
        ::new when we want to pass the constructor.

        The accumulator is the "Arraylist::add" method. That's how
        we'll add the items to the Arraylist.

        Finally the ::addAll method is the combiner, so the accumulator is used when
        the runtime needs to add a single version or a single item into the list/result.
        The combiner is sometimes used to improve the efficiency of the operation,
        if and when to do this is really up to the java runtime */


        for (String s: outputOfIONNumberStream) {
            System.out.println(s);
        }




     }
}
