package com.company.ques1;
//PG class(child)
public class PG extends Student {
    //variable declaration
    private String department;
    private String specialisation;
    private int cgpa;
    private String thesisArea;
    private boolean graduate;

    //PG class constructor
    public PG (String name, String rollNo, String course, int duration, int credits, String department, String specialisation, int cgpa, String thesisArea)
    {
        super(name,rollNo,course,duration,credits);
        this.department = department;
        this.specialisation = specialisation;
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        graduate = false;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //setter function for specialisation
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    //setter function for cgpa
    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    //setter function for thesisarea
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

    //getter function for cgpa
    public int getCgpa() {
        return cgpa;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

    //function to check if student can graduate
    public boolean canGraduate(PG student)
    {
        if (student.getDuration() >= 2 && student.getDuration() <= 4 && student.getCredits() >= 80)
        {
            graduate = true;
        }
        return graduate;
    }
}
