package com.company.ques2;

public class Phd extends Student {
    private String thesisArea;
    private boolean graduate;
    public Phd (String name, String rollNo, String course, int duration, String thesisArea)
    {
        super(name,rollNo,course,duration);
        this.thesisArea = thesisArea;
        graduate = false;
    }

    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public String getThesisArea() {
        return thesisArea;
    }

    public boolean canGraduate(Phd student)
    {
        if (student.getDuration() >= 2 && student.getDuration() <= 6 && student.getCredits() >= 64)
        {
            graduate = true;
        }
        return graduate;
    }
}
