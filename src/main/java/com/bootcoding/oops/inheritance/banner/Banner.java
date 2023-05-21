package com.bootcoding.oops.inheritance.banner;

public class Banner {
    String color;
    String matter;
    String type;
    String material;
    //String text;
   // String dimension;
//    double price;
    Banner(){
        System.out.println("Banner object is created");
    }
    public void create(){
        System.out.println("Banner has been created");
    }
    public void display(){
        System.out.println("Display");
        System.out.println("material "+material);
        System.out.println("type "+type);
    }
}
