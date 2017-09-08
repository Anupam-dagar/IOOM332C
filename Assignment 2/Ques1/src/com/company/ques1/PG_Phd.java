package com.company.ques1;

public class PG_Phd extends Student {
    private int cgpa;
    private String thesisArea;
    private int migrateYear;
    private boolean graduate;
    public PG_Phd (String name, String rollNo, String course, int duration, int credits, int cgpa, String thesisArea, int migrateYear)
    {
        super(name,rollNo,course,duration,credits);
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        this.migrateYear = migrateYear;
        graduate = false;
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

    public boolean canGraduate(PG_Phd student)
    {
        if (student.getDuration() >= 4 && student.getDuration() <= 7 && student.getCredits() >= 138)
        {
            graduate = true;
        }
        return graduate;
    }
}
