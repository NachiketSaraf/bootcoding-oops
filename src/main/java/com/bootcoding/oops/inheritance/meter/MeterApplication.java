package com.bootcoding.oops.inheritance.meter;

public class MeterApplication {
    public static void main(String[] args) {
        SinglePhaseMeter sp =new SinglePhaseMeter();
        sp.type = "Single phase";
        sp.voltage = 240;
        sp.create();
        sp.display();
    }
}
