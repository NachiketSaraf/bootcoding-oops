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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
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
