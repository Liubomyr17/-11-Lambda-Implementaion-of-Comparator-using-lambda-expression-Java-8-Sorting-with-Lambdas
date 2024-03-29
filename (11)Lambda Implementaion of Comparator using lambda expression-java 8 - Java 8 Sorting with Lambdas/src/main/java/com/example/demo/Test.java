package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

    List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
        empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
        empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));

        System.out.println("List of employee before sorting...");
        empList.forEach(System.out::println);

//        empList.sort(new EmployeeNameSorter());
//        empList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println("---------------------------------------------");
        System.out.println("List of employee after sorting...");
        empList.forEach(System.out::println);
    }
}
