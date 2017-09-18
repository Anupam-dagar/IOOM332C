package com.company.ques1;
//UG class(child)
public class UG extends Student {
    //variable declaration
    private String department;
    private int cgpa;
    private boolean graduate;

    //UG class constructor
    public UG (String name, String rollNo, String course, int duration, int credits, String department, int cgpa)
    {
        super(name,rollNo,course,duration,credits);
        this.department = department;
        this.cgpa = cgpa;
        graduate = false;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //setter function for cgpa
    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    //setter function for department
    public String getDepartment() {
        return department;
    }

    //setter funciton for cgpa
    public int getCgpa() {
        return cgpa;
    }

    //function to check if student can graduate
    public boolean canGraduate(UG student)
    {
        if (student.getDuration() >= 4 && student.getDuration() <= 7 && student.getCredits() >= 185 )
        {
            graduate = true;
        }
        return graduate;
    }
}
