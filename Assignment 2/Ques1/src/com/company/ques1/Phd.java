package com.company.ques1;
//Phd class(child)
public class Phd extends Student {
    //variable declaration
    private String thesisArea;
    private boolean graduate;

    //Phd class constructor
    public Phd (String name, String rollNo, String course, int duration, int credits, String thesisArea)
    {
        super(name,rollNo,course,duration,credits);
        this.thesisArea = thesisArea;
        graduate = false;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

    //function to check if student can graduate
    public boolean canGraduate(Phd student)
    {
        if (student.getDuration() >= 2 && student.getDuration() <= 6 && student.getCredits() >= 64)
        {
            graduate = true;
        }
        return graduate;
    }
}
