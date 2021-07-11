package org.example.good.java;

import org.example.good.java.model.vo.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(1);
        System.out.println(person);
    }
}
