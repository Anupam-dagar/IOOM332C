package com.company.assignment1ques5;

//class definition of Student
public class Student {
    //variable declaration
    private String rollno;
    private String name;

    //Student class constructor
    public Student (String rollnoArg, String nameArg)
    {
        rollno = rollnoArg;
        name = nameArg;
    }

    //setter function for rollno
    public void setRollno(String rollnoArg) {
        rollno = rollnoArg;
    }

    //setter function for name
    public void setName(String nameArg) {
        name = nameArg;
    }

    //getter function for rollno
    public String getRollno() {
        return rollno;
    }

    //getter function for name
    public String getName() {
        return name;
    }
}
