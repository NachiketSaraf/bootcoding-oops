package com.bootcoding.oops.inheritance.meter;

public class Meter {
    int voltage;
    String type;
    String color;
    public void create(){
        System.out.println("created");
    }
    public void display(){
        System.out.println("Display");
        System.out.println(voltage);
        System.out.println(type);
    }
}
