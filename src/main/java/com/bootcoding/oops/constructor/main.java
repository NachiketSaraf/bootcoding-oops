package com.bootcoding.oops.constructor;

public class main {
    public static void main(String[] args) {
        A ab = new A();
        //ab.a = 9;
        System.out.println(ab.a);
        A nm = new A(12);
        System.out.println(nm.a);
    }
}
