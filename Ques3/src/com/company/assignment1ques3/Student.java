package com.company.assignment1ques3;
// Student class which contain all information about the student
public class Student {
    //variable declaration
    private String rollNo;
    private String name;
    private int intelligence;
    private int marksObtained;
    private int type;
    private int totalMarks = 0;

    //student class constructor
    public Student(String rollNoArg, String nameArg, int intelligenceArg, int typeArg) {
        rollNo = rollNoArg;
        name = nameArg;
        intelligence = intelligenceArg;
        type = typeArg;
    }

    //function to set roll no. of student
    public void setRollNo(String rollNoArg) {
        rollNo = rollNoArg;
    }

    //function to set name of student
    public void setName(String nameArg) {
        name = nameArg;
    }

    //function to set intelligence of student
    public void setIntelligence(int intelligenceArg) {
        intelligence = intelligenceArg;
    }

    //function to set type

    public void setType(int typeArg) {
        type = typeArg;
    }

    public void setTotalMarks(int marksObtainedArg)
    {
        totalMarks = totalMarks + marksObtainedArg;
    }

    //function to get roll no of student
    public String getRollNo() {
        return rollNo;
    }

    //function to get name of student
    public String getName() {
        return name;
    }

    //function to get intelligence of student
    public int getIntelligence() {
        return intelligence;
    }

    //function to set marksobtained of student
    public void setMarksObtained(int baseMarks, int intelligence)
    {
        marksObtained = baseMarks * intelligence;
    }

    //function to get marks obtained by student
    public int getMarksObtained() {
        return marksObtained;
    }

    //function to get type

    public int getType() {
        return type;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}