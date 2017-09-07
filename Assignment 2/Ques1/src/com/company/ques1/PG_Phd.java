package com.company.ques1;

public class PG_Phd extends Student {
    private int cgpa;
    private String thesisArea;
    private int migrateYear;

    public PG_Phd (int cgpa, String thesisArea, int migrateYear)
    {
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        this.migrateYear = migrateYear;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public void setMigrateYear(int migrateYear) {
        this.migrateYear = migrateYear;
    }

    public int getCgpa() {
        return cgpa;
    }

    public String getThesisArea() {
        return thesisArea;
    }

    public int getMigrateYear() {
        return migrateYear;
    }
}
