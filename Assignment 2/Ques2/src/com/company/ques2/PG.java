package com.company.ques2;
//PG class(child)
public class PG extends Student {
    //variable declaration
    private String department;
    private String specialisation;
    private String thesisArea;

    //PG class constructor
    public PG (String name, String rollNo, String course, int duration, String department, String specialisation, String thesisArea)
    {
        super(name,rollNo,course,duration);
        this.department = department;
        this.specialisation = specialisation;
        this.thesisArea = thesisArea;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //setter function for specialisation
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //getter function for department
    public String getDepartment() {
        return department;
    }

    //getter function for specialisation
    public String getSpecialisation() {
        return specialisation;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

}
