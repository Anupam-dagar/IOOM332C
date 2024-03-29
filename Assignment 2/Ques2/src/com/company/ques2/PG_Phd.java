package com.company.ques2;
//PG_Phd class(child)
public class PG_Phd extends Student {
    //variable declaration
    private String thesisArea;
    private int migrateYear;

    //PG_Phd class constructor
    public PG_Phd (String name, String rollNo, String course, int duration, String thesisArea, int migrateYear)
    {
        super(name,rollNo,course,duration);
        this.thesisArea = thesisArea;
        this.migrateYear = migrateYear;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //setter function for migrateYear
    public void setMigrateYear(int migrateYear) {
        this.migrateYear = migrateYear;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

    //getter function for migrateYear
    public int getMigrateYear() {
        return migrateYear;
    }

}
