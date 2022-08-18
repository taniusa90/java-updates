package com.cydeo;

import com.cydeo.tasks.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Apple {

    private int weight;
    private Color color;


    public static class UserTest {

        public static void main(String[] args) {

            List<User> users = new ArrayList<>();
            users.add(new User("Mike","Smith",35));
            users.add(new User("Tom","Smith",25));
            users.add(new User("Emma","Smith",55));

            //Print all elements in the list

            printName(users,user -> true);

            System.out.println();

            printName(users,user -> user.getFirstName().startsWith("E"));

        }

        private static void printName(List<User>userList, Predicate<User> p){


            for (User user : userList){
                if (p.test(user)){
                    System.out.println(user.toString());


                }
            }

        }
    }
}
