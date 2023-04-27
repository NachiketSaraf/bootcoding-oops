package com.bootcoding.oops.encapsulation.patient;

import java.util.Date;

public class Patient {
    private String disease;
    private String name;
    private Date dateOfAdmission;
    private Date dateOfDischarged;

    public void setDisease(String disease) {
        this.disease = disease;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
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
