package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //Zero Argument Constructor

        Supplier<Car> s1=()->new Car();//will return car
        System.out.println(s1.get().getModel());

        Supplier<Car>c2=Car::new;
        System.out.println(c2.get().getModel());

        //One Argument Constructor

        Function<Integer,Car>car3=model->new Car(model);
        Function<Integer,Car>car4=Car::new;

        //Two Argument Constructor
        BiFunction<String,Integer,Car> car5=Car::new;
        Car honda=car5.apply("Honda",2015);
        System.out.println(honda.getMake()+" "+honda.getModel());



    }
}
