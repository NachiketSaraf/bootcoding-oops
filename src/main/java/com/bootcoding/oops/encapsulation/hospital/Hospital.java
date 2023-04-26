package com.bootcoding.oops.encapsulation.hospital;

import java.util.UUID;

public class Hospital {
    private String name;
    private UUID id;
    private String address;
    private String services;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setServices(String services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Hospital" +
                "\nname = " + name +
                "\nid = " + id +
                "\naddress = " + address +
                "\nservices = " + services ;
    }
}
