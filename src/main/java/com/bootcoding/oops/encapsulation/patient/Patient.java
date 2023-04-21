package com.bootcoding.oops.encapsulation.patient;

import java.util.Date;

public class Patient {
    private String disease;
    private String name;
    private Date dateOfAdmission;
    private Date dateOfDischarged;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Date getDateOfDischarged() {
        return dateOfDischarged;
    }

    public void setDateOfDischarged(Date dateOfDischarged) {
        this.dateOfDischarged = dateOfDischarged;
    }

    @Override
    public String toString() {
        return "Patient" +
                "\ndisease = " + disease +
                "\nname = " + name  +
                "\ndateOfAdmission = " + dateOfAdmission +
                "\ndateOfDischarged = " + dateOfDischarged
                ;
    }
}
