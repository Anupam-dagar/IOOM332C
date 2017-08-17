package com.company.assignment1;

public class Student {
    private int rollNo;
    private String name;
    private int intelligence;

    public Student(int rollNoArg, String nameArg, int intelligenceArg) {
        rollNo = rollNoArg;
        name = nameArg;
        intelligence = intelligenceArg;
    }

    public void setRollNo(int rollNoArg) {
        rollNo = rollNoArg;
    }

    public void setName(String nameArg) {
        name = nameArg;
    }

    public void setIntelligence(int intelligenceArg) {
        intelligence = intelligenceArg;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getIntelligence() {
        return intelligence;
    }
}