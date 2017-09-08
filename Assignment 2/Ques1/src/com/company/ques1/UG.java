package com.company.ques1;

public class UG extends Student {
    private String department;
    private int cgpa;
    private boolean graduate;
    public UG (String name, String rollNo, String course, int duration, int credits, String department, int cgpa)
    {
        super(name,rollNo,course,duration,credits);
        this.department = department;
        this.cgpa = cgpa;
        graduate = false;
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

    public boolean canGraduate(UG student)
    {
        if (student.getDuration() >= 4 && student.getDuration() <= 7 && student.getCredits() >= 185 )
        {
            graduate = true;
        }
        return graduate;
    }
}
