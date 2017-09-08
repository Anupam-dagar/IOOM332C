package com.company.ques2;

public class Student {
    private String name;
    private String rollNo;
    private String course;
    private int duration;
    private String department;
    private String specialization;
    private int cgpa;
    private int totalGrad;

    public Student(){}
    public Student (String name, String rollNo, String course, int duration)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.duration = duration;
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


    public int getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setTotalGrad(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++)
        {
            if (studentArray[i].getName() != null)
            {
                totalGrad = totalGrad + 1;
            }
        }
    }

    public int getTotalGrad() {
        return totalGrad;
    }
}
