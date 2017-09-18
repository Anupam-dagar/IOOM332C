package com.company.ques3;

public class UG_PG extends Student {
    private String specialisation;
    private String department;
    private String thesisArea;
    private int endYear;
    private boolean graduate;

    public UG_PG (String name, String rollNo, String course, int duration, String specialisation, String thesisArea, int endYear, String department)
    {
        super(name,rollNo,course,duration);
        this.specialisation = specialisation;
        this.thesisArea = thesisArea;
        this.endYear = endYear;
        this.department = department;
        graduate = false;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
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
        {
            graduate = true;
        }
        return graduate;
    }
}
