package com.company.ques1;

public class UG_PG extends Student {
    private String specialisation;
    private String department;
    private int cgpa;
    private String thesisArea;
    private int endYear;
    private boolean graduate;

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

    public void setDepartment(String department) {
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public boolean canGraduate(UG_PG student)
    {
        System.out.println(student.getDuration() + " " + student.getCredits());
        if (student.getDuration() >= 5 && student.getDuration() <= 8 && student.getCredits() >= 265)
        {
            graduate = true;
        }
        return graduate;
    }
}
