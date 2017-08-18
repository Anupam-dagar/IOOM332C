package com.company.assignment1;

public class Student {
    private String rollNo;
    private String name;
    private int intelligence;

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
}