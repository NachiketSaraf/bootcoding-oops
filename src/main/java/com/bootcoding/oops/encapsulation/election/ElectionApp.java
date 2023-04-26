package com.bootcoding.oops.encapsulation.election;

import com.bootcoding.oops.encapsulation.election.candidate.Candidate;
import com.bootcoding.oops.encapsulation.election.election.Election;

import java.util.Calendar;
import java.util.Date;

public class ElectionApp {
    public static void main(String[] args) {
        Candidate ghansham = new Candidate();
        ghansham.setName("Ghansham");
        ghansham.setAge(45);
        ghansham.setCriminalRecord(0);
        ghansham.setEducation("Engineer");
        ghansham.setProperty("500cr");

        Election ele = new Election();
        ele.setCity("Nagpur");
        ele.setDateOfElection(getNextDate(20));
        ele.setCriteria("Engineer");

        System.out.println(ghansham);
        System.out.println(ele);

    }
    private static Date getNextDate(int days){
        Calendar cal =Calendar.getInstance();
        cal.add(Calendar.DATE,days);
        //System.out.println("Date = "+ cal.getTime());
        return cal.getTime();
    }
}
