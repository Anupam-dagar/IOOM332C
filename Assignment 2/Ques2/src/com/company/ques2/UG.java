package com.company.ques2;
//UG class(child)
public class UG extends Student {
    //variable declaration
    private String department;

    //UG class constructor
    public UG (String name, String rollNo, String course, int duration)
    {
        super(name,rollNo,course,duration);
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //getter function for department
    public String getDepartment() {
        return department;
    }
}
