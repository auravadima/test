package com.goodline.lessons;

import com.goodline.helpers.Variables;

public class Cycles {
    public static void main(String[] args) {
        String[] names = Variables.names;
        Person[] people = new Person[10];
//        person.name ="dsfsdf";
//        person.age = 21;
        for (Person person : people) {
//            System.out.println(person.name);
            System.out.println(person.age);
            continue;
        }
        while(true) {

            if(5 > 4) {
                break;
            }
        }
    }
}

class Person {
    public static String city;
    private String name;
    private String lastName;
    public int age;

    public String fullName() {

        return name + " " + lastName;
    }

    public Person birth(String name) {
        Person p = new Person();
        p.name = name;
        return p;
    }
}