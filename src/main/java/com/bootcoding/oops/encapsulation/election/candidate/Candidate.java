package com.bootcoding.oops.encapsulation.election.candidate;

public class Candidate {
    private String name;
    private String property;
    private int age;
    private int criminalRecord;
    private String education;

    public void setEducation(String education) {
        this.education = education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCriminalRecord(int criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    @Override
    public String toString() {
        return "Candidate" +
                "\nname= " + name  +
                "\nproperty= " + property +
                "\nage= " + age +
                "\ncriminalRecord= " + criminalRecord
                ;
    }
}
