package com.company.ques1;

public class Phd extends Student {
    private String thesisArea;
    private boolean graduate;
    public Phd (String name, String rollNo, String course, int duration, int credits, String thesisArea)
    {
        super(name,rollNo,course,duration,credits);
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
