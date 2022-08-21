package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharStreamClass {

    public static void main(String[] args) {

        List<String> words=new ArrayList<>(Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER"));
        words.stream()
                .map(str->str.length())
                .forEach(System.out::println);


    }
}
