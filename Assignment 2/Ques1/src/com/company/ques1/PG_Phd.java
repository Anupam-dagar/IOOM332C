package com.company.ques1;
//PG_Phd class(child)
public class PG_Phd extends Student {
    //variable declaration
    private int cgpa;
    private String thesisArea;
    private int migrateYear;
    private boolean graduate;

    //PG_Phd class constructor
    public PG_Phd (String name, String rollNo, String course, int duration, int credits, int cgpa, String thesisArea, int migrateYear)
    {
        super(name,rollNo,course,duration,credits);
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        this.migrateYear = migrateYear;
        graduate = false;
    }

    //setter function for cgpa
    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //setter function for migrateYear
    public void setMigrateYear(int migrateYear) {
        this.migrateYear = migrateYear;
    }

    //getter function for cgpa
    public int getCgpa() {
        return cgpa;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

    //getter function for migrateYear
    public int getMigrateYear() {
        return migrateYear;
    }

    //function to check if student can graduate
    public boolean canGraduate(PG_Phd student)
    {
        if (student.getDuration() >= 4 && student.getDuration() <= 7 && student.getCredits() >= 138)
        {
            graduate = true;
        }
        return graduate;
    }
}
