package com.cydeo.tasks;

import com.cydeo.Apple;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange>inventory=new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(50,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(150,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of "+orange.getWeight()+" g";

        prettyPrintApple(inventory,orangeLambda);
        //prettyPrintApple(inventory,orange -> "An orange of "+orange.getWeight()+" g");




    }

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){

        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }


    }
}
