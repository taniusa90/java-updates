package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person person1 = new Person("mike",35,Gender.MALE);
        Person person2 = new Person("ozzy",25,Gender.MALE);
        Person person3 = new Person("tom",28,Gender.MALE);
        Person person4 = new Person("ally",36,Gender.FEMALE);
        List<Person>personList= Arrays.asList(person1,person2,person3,person4);
        CheckMember checkMember = person -> person.getGender()==Gender.MALE && person.getAge()>18 && person.getAge()<=25;
        person(personList,checkMember);
        //person(personList,person -> person.getGender()==Gender.MALE && person.getAge()>18 && person.getAge()<=25);


    }

    private static void person(List<Person>personList,CheckMember checkMember){
        List<Person>result = new ArrayList<>();
        for (Person person : personList ){
            if (checkMember.test(person)){//if is true or false
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
