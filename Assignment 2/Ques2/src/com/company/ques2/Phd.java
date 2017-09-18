package com.company.ques2;
//Phd class(child)
public class Phd extends Student {
    //variable declaration
    private String thesisArea;

    //Phd class constructor
    public Phd (String name, String rollNo, String course, int duration, String thesisArea)
    {
        super(name,rollNo,course,duration);
        this.thesisArea = thesisArea;
    }

    //setter function for thesisArea
    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    //getter function for thesisArea
    public String getThesisArea() {
        return thesisArea;
    }

}
