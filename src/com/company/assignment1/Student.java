package com.company.assignment1;
// Student class which contain all information about the student
public class Student {
    //variable declaration
    private String rollNo;
    private String name;
    private int intelligence;
    private int marksObtained;

    public Student(String rollNoArg, String nameArg, int intelligenceArg) {
        rollNo = rollNoArg;
        name = nameArg;
        intelligence = intelligenceArg;
    }

    public void setRollNo(String rollNoArg) {
        rollNo = rollNoArg;
    }

    public void setName(String nameArg) {
        name = nameArg;
    }

    public void setIntelligence(int intelligenceArg) {
        intelligence = intelligenceArg;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setMarksObtained(int baseMarks, int intelligence)
    {
        marksObtained = baseMarks * intelligence;
    }
}