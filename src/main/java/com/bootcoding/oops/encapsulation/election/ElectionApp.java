package com.bootcoding.oops.encapsulation.election;

import com.bootcoding.oops.encapsulation.election.candidate.Candidate;
import com.bootcoding.oops.encapsulation.election.election.Election;

import java.util.Calendar;
import java.util.Date;

public class ElectionApp {
    public static void main(String[] args) {
        Candidate can = new Candidate();
        can.setName("Ghansham");
        can.setAge(45);
        can.setCriminalRecord(0);
        can.setEducation("Engineer");
        can.setProperty("500cr");

        Election ele = new Election();
        ele.setCity("Nagpur");
        ele.setDateOfElection(getNextDate(20));
        ele.setCriteria("Engineer");

        System.out.println(can);
        System.out.println(ele);

    }
    private static Date getNextDate(int days){
        Calendar cal =Calendar.getInstance();
        cal.add(Calendar.DATE,days);
        //System.out.println("Date = "+ cal.getTime());
        return cal.getTime();

    }
}
