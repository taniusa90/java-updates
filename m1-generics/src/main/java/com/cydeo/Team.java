package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{//Any class you can pass to Team. Should accept only Player class and subclasses

   private String name;

   private List<T> members = new ArrayList<>();

   public Team(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public boolean addPlayer(T player){
      System.out.println(player.getName()+" picked for team "+this.name);
      return true;
   }
}
