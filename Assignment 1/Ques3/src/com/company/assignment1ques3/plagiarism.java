package com.company.assignment1ques3;

public class plagiarism {
    private String rollno;
    private String course;

    public plagiarism(String rollnoArg, String courseArg)
    {
        rollno = rollnoArg;
        course = courseArg;
    }

    public void setRollno(String rollnoArg) {
        rollno = rollnoArg;
    }

    public void setCourse(String courseArg) {
        course = courseArg;
    }

    public String getRollno() {
        return rollno;
    }

    public String getCourse() {
        return course;
    }
}
