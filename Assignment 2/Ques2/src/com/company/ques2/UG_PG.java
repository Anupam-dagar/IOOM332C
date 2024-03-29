package com.company.ques2;
//UG_PG class(child)
public class UG_PG extends Student {
    //variable declaration
    private String specialisation;
    private String department;
    private String thesisArea;
    private int endYear;
    private boolean graduate;

    //UG_PG class constructor
    public UG_PG (String name, String rollNo, String course, int duration, String specialisation, String thesisArea, int endYear, String department)
    {
        super(name,rollNo,course,duration);
        this.specialisation = specialisation;
        this.thesisArea = thesisArea;
        this.endYear = endYear;
        this.department = department;
        graduate = false;
    }

    //setter function for specialisation
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //setter function for endYear
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //getter function for specialisation
    public String getSpecialisation() {
        return specialisation;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

    //getter function for endYear
    public int getEndYear() {
        return endYear;
    }

    //getter function for department
    public String getDepartment() {
        return department;
    }
}
