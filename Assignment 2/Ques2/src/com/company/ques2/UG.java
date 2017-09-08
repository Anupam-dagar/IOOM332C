package com.company.ques2;

public class UG extends Student {
    private String department;
    private boolean graduate;
    public UG (String name, String rollNo, String course, int duration)
    {
        super(name,rollNo,course,duration);
        graduate = false;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
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
