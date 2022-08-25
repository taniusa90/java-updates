package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("*******ALL MATCH********");//All data is less than 1000
        boolean isHealthy=DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);//true

        System.out.println("*******ANY MATCH********");

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian));
        System.out.println("The menu is vegetarian friendly");

        System.out.println("*******NONE MATCH********");

        boolean isHealthy2=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);//true

        System.out.println("*******FIND ANY********");
        Optional<Dish> dish= DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());//will return random vegetarian dish, but all time will return first

        System.out.println("*******FIND FIRST********");
        Optional<Dish>dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS(Async)
        System.out.println(IntStream.range(0,100).parallel().findAny().getAsInt());//async 65
        System.out.println(IntStream.range(0,100).parallel().findFirst().getAsInt());//0

        List<String> list= Arrays.asList("John","David","Jack","Duke","Dany","Julia","Divya");
        List<String> list2= Arrays.asList("John","David","Jack","Duke","Dany","Julia","Divya");
        Optional<String>findFirst=list.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String>findFirst2=list2.parallelStream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(findFirst.get());
        System.out.println(findFirst2.get());

        //David
        //Julia

        System.out.println("*******MIN AND MAX********");

        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);













    }




}
