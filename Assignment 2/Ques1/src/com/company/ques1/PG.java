package com.company.ques1;

public class PG extends Student {
    private String department;
    private String specialisation;
    private int cgpa;
    private String thesisArea;
    private boolean graduate;
    public PG (String name, String rollNo, String course, int duration, int credits, String department, String specialisation, int cgpa, String thesisArea)
    {
        super(name,rollNo,course,duration,credits);
        this.department = department;
        this.specialisation = specialisation;
        this.cgpa = cgpa;
        this.thesisArea = thesisArea;
        graduate = false;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getDepartment() {
        return department;
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

    public boolean canGraduate(PG student)
    {
        if (student.getDuration() >= 2 && student.getDuration() <= 4 && student.getCredits() >= 80)
        {
            graduate = true;
        }
        return graduate;
    }
}
