package com.bootcoding.oops.encapsulation.encapculation_app;

import com.bootcoding.oops.encapsulation.hospital.Hospital;
import com.bootcoding.oops.encapsulation.patient.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class HospitalApp {
    public static void main(String[] args) {
        Patient ram = new Patient();
        ram.setName("Ram");
        ram.setDateOfAdmission(getPreviousDate(4));
        ram.setDateOfDischarged(new Date());
        ram.setDisease("Cold");
        System.out.println(ram);

        Hospital orangeCityHospital = new Hospital();
        orangeCityHospital.setName("Orange City Hospital");
        orangeCityHospital.setAddress("Orange city square Nagpur");
        orangeCityHospital.setServices("Multi-specialist Hospital");
        orangeCityHospital.setId(UUID.randomUUID());

        System.out.println(orangeCityHospital);
    }
    private static Date getPreviousDate(int days){
        Calendar cal =Calendar.getInstance();
        cal.add(Calendar.DATE,days*-1);
        System.out.println("Date = "+ cal.getTime());

        return cal.getTime();

    }

}
