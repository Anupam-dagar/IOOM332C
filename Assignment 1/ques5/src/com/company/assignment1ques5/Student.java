package com.company.assignment1ques5;

//class definition of Student
public class Student {
    //variable declaration
    private String rollno;
    private String name;
    private int sum = 0;

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

    public void setSumZero()
    {
        sum = 0;
    }

    public void setSum(int totalMarks)
    {
        sum = sum + totalMarks;
    }

    //getter function for rollno
    public String getRollno() {
        return rollno;
    }

    //getter function for name
    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }
}
