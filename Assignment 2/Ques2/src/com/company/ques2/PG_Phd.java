package com.company.ques2;

public class PG_Phd extends Student {
    private String thesisArea;
    private int migrateYear;
    private boolean graduate;
    public PG_Phd (String name, String rollNo, String course, int duration, String thesisArea, int migrateYear)
    {
        super(name,rollNo,course,duration);
        this.thesisArea = thesisArea;
        this.migrateYear = migrateYear;
        graduate = false;
    }


    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public void setMigrateYear(int migrateYear) {
        this.migrateYear = migrateYear;
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
