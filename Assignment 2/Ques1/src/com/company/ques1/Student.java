package com.company.ques1;

public class Student {
    private String name;
    private String rollNo;
    private String course;
    private int duration;
    private int credits;
    private String department;
    private String specialization;
    private int cgpa;

    public Student(){}
    public Student (String name, String rollNo, String course, int duration, int credits)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.duration = duration;
        this.credits = credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public int getDuration() {
        return duration;
    }

    public int getCredits() {
        return credits;
    }

    public int getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }
}
