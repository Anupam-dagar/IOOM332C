package com.company.ques1;
//student class (parent)
public class Student {
    //variable declaration
    private String name;
    private String rollNo;
    private String course;
    private int duration;
    private int credits;
    private String department;
    private String specialization;
    private int cgpa;
    private int totalGrad;

    //constructor declaration
    public Student(){}
    public Student (String name, String rollNo, String course, int duration, int credits)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.duration = duration;
        this.credits = credits;
    }

    //setter function for name
    public void setName(String name) {
        this.name = name;
    }

    //setter function for rollNo
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    //setter function for course
    public void setCourse(String course) {
        this.course = course;
    }

    //setter function for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //setter function for credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //setter function for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //setter function for cgpa
    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    //getter function for name
    public String getName() {
        return name;
    }

    //getter function for rollNo
    public String getRollNo() {
        return rollNo;
    }

    //getter function for course
    public String getCourse() {
        return course;
    }

    //getter function for duration
    public int getDuration() {
        return duration;
    }

    //getter function for credits
    public int getCredits() {
        return credits;
    }

    //getter function for cgpa
    public int getCgpa() {
        return cgpa;
    }

    //getter function for department
    public String getDepartment() {
        return department;
    }

    //getter function for specialization
    public String getSpecialization() {
        return specialization;
    }

    //setter function for totalgrad
    public void setTotalGrad(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++)
        {
            if (studentArray[i].getName() != null)
            {
                totalGrad = totalGrad + 1;
            }
        }
    }

    //getter function for totalGrad
    public int getTotalGrad() {
        return totalGrad;
    }
}
