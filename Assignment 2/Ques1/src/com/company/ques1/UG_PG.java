package com.company.ques1;

public class UG_PG extends Student {
    private String specialisation;
    private int cgpa;
    private String thesisArea;
    private int endYear;

    public UG_PG (String specialisation, int cgpa, String thesisArea, int endYear)
    {
        this.specialisation = specialisation;
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        this.endYear = endYear;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public int getCgpa() {
        return cgpa;
    }

    public String getThesisArea() {
        return thesisArea;
    }

    public int getEndYear() {
        return endYear;
    }
}
