package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        System.out.println("Print all Emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("Print all phone numbers with double colon");
        EmployeeData.readAll()
                .map(Employee::getPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
