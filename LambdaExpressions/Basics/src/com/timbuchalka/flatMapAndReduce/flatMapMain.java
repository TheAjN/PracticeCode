package com.timbuchalka.flatMapAndReduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//.flatMap(), .collect(Collectors.groupBy())  and .reduce() concept
public class flatMapMain {

    public static void main(String[] args) {

        Employee john = new Employee("John", 34);
        Employee zed = new Employee("Zed", 26);
        Employee lee = new Employee("Lee", 45);
        Employee devrath = new Employee("Devrath", 55);


        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(devrath);
        hr.addEmployee(zed);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(lee);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                //.flatMap() returns the stream of values(Employees) of
                // a particular object(Department) that contains a list
                //and these objects are streamed from .stream() method where it streams departments object

                //.flatMap() accepts one argument but returns a stream, the stream doesn't need to be
                //the same type as that of the arguement, since the argument value will have its own list of
                // values, in this case, the result stream of flatMap is of type "Employee"

                .forEach(System.out::println);


        // using .collect() to assign (key,value) to a map
        Map<Integer, List<Employee>> values= departments
                .stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));
        //Collectors.groupingBy(Employee::getAge)
        //groups keys together (here key value is of type integer) and returns a map

        System.out.println("===============MAP LOOOOP===================");
        for(Map.Entry<Integer, List<Employee>> e : values.entrySet()){
            System.out.println(e.getKey()+"   "+e.getValue());
        }


        System.out.println("===============REDUCE()===================");
        //.reduce() stream method
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) ->e1.getAge()<e2.getAge()? e1:e2)
                //reduces the stream to values that support the condition,
                .ifPresent(System.out::println);    //prints the value if present

    }
}
