package com.company.ques1;

public class Phd extends Student {
    private String thesisArea;

    public Phd (String thesisArea)
    {
        this.thesisArea = thesisArea;
    }

    public void setThesisArea(String thesisArea) {
        this.thesisArea = thesisArea;
    }

    public String getThesisArea() {
        return thesisArea;
    }
}
