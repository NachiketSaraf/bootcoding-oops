package com.bootcoding.oops.encapsulation.election.election;

import java.util.Date;

public class Election {
    private String city;
    private String criteria;
    private Date dateOfElection;

    public void setCity(String city) {
        this.city = city;
    }

    public void setDateOfElection(Date dateOfElection) {
        this.dateOfElection = dateOfElection;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    @Override
    public String toString() {
        return "\nElection" +
                "\ncity= " + city + '\'' +
                "\ncriteria= " + criteria + '\'' +
                "\ndateOfElection= " + dateOfElection ;
    }
}
