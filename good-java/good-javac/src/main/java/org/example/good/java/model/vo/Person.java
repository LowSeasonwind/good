package org.example.good.java.model.vo;

import org.example.good.java.annotation.annotation.lombok.Getter;

@Getter
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
