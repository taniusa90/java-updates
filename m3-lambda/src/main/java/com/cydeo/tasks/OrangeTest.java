package com.cydeo.tasks;

import com.cydeo.Apple;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange>inventory=new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of "+orange.getWeight()+" g";

        prettyPrintApple(inventory,orangeLambda);
        //prettyPrintApple(inventory,orange -> "An orange of "+orange.getWeight()+" g");

        System.out.println();

        OrangeFormatter fancyFormatter=orange -> {
            String ch = orange.getWeight()>200 ? "Heavy" : "Light";
            return "A "+ ch+" "+orange.getColor()+" orange";
        };
        prettyPrintApple(inventory,fancyFormatter);


        Function<Orange,String>function=orange -> "An orange of "+orange.getWeight()+" g";
        printOrangeWithFunction(inventory,function);
        System.out.println("----------");
        Function<Orange,String>function1=orange -> {
            String ch = orange.getWeight()>200 ? "Heavy" : "Light";
            return "A "+ ch+" "+orange.getColor()+" orange";

        };

        printOrangeWithFunction(inventory,function1);





    }

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){

        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }


    }

    public static void printOrangeWithFunction(List<Orange> orangeList, Function<Orange,String>function){

        for (Orange orange : orangeList){
            String output=function.apply(orange);
            System.out.println(output);

        }
    }
}
