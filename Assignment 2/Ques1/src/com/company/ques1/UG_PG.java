package com.company.ques1;
//UG_PG class(child)
public class UG_PG extends Student {
    //variable declaration
    private String specialisation;
    private String department;
    private int cgpa;
    private String thesisArea;
    private int endYear;
    private boolean graduate;

    //UG_PG class constructor
    public UG_PG (String name, String rollNo, String course, int duration, int credits, String specialisation, int cgpa, String thesisArea, int endYear, String department)
    {
        super(name,rollNo,course,duration,credits);
        this.specialisation = specialisation;
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        this.endYear = endYear;
        this.department = department;
        graduate = false;
    }

    //setter function for specialisation
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    //setter function for cgpa
    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
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

    //getter function for cgpa
    public int getCgpa() {
        return cgpa;
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

    //function to check if student can graduate
    public boolean canGraduate(UG_PG student)
    {
        if (student.getDuration() >= 5 && student.getDuration() <= 8 && student.getCredits() >= 265)
        {
            graduate = true;
        }
        return graduate;
    }
}
