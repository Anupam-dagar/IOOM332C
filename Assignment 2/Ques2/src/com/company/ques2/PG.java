package com.company.ques2;

public class PG extends Student {
    private String department;
    private String specialisation;
    private String thesisArea;
    private boolean graduate;
    public PG (String name, String rollNo, String course, int duration, String department, String specialisation, String thesisArea)
    {
        super(name,rollNo,course,duration);
        this.department = department;
        this.specialisation = specialisation;
        this.thesisArea = thesisArea;
        graduate = false;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }


    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialisation() {
        return specialisation;
    }


    public String getThesisArea() {
        return thesisArea;
    }

    public boolean canGraduate(PG student)
    {
        if (student.getDuration() >= 2 && student.getDuration() <= 4 && student.getCredits() >= 80)
        {
            graduate = true;
        }
        return graduate;
    }
}
