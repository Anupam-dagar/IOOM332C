package com.company.ques3;

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
        {
            graduate = true;
        }
        return graduate;
    }
}
