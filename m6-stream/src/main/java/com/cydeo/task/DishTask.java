package com.cydeo.task;

import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {


        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .forEach(System.out::println);
        System.out.println("----------------");
        //Print the length of the name of each list
        DishData.getAll().stream()
                .map(i->i.getName().length())
                .forEach(System.out::println);
        System.out.println("--------------------");
        //Print three high caloric dish name(>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------");
        //Print all dish name that are below 400 calories in sorted
        System.out.println("----------");
        DishData.getAll().sort(Comparator.comparing(Dish::getCalories));
        DishData.getAll().stream()
                .filter(s->s.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .forEach(System.out::println);

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("----------");
        DishData.getAll().stream()
                .map(name->name.getName())
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("-----------------");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);











    }
}
