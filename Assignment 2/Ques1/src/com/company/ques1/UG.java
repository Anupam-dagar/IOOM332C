package com.company.ques1;

public class UG extends Student {
    private String department;
    private int cgpa;

    public UG (String department, int cgpa)
    {
        this.department = department;
        this.cgpa = cgpa;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public int getCgpa() {
        return cgpa;
    }
}
