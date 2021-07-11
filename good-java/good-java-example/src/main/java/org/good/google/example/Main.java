package org.good.google.example;

import org.good.google.example.core.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        person.setName("");
        System.out.println(person);
    }
}
