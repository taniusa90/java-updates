package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()<200;
            }
        };

        System.out.println("************PREDICATE***************");

        Predicate<Integer>predicate= p->p<18;
        System.out.println(predicate.test(20));//false

        System.out.println("************Consumer***************");
        Consumer<Integer>consumer=c-> System.out.println(c);
        consumer.accept(20);

        System.out.println("************BiConsumer***************");

        BiConsumer<Integer,Integer> biConsumer = (t,v)-> System.out.println(t+v);
        biConsumer.accept(10,20);

        System.out.println("************BiFunction***************");

        BiFunction<Integer,Integer,Integer>biFunction = (x,y)->x+y;
        System.out.println(biFunction.apply(15,25));

        System.out.println("************Supplier***************");

        Supplier<Double>supplier=()->Math.random();
        System.out.println(supplier.get());
    }
}
