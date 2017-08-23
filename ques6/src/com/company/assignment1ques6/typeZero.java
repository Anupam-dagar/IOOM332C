package com.company.assignment1ques6;

//class definition of typeZero assignment
public class typeZero {
    //variable declaration
    private String name;
    private String notes;
    private int totalMarks;
    private String assignmentId;

    //typeZero class constructor
    public typeZero(String nameArg, String notesArg, int totalMarksArg, String assignmentIdArg)
    {
        name = nameArg;
        notes = notesArg;
        totalMarks = totalMarksArg;
        assignmentId = assignmentIdArg;
    }

    //setter function for name
    public void setName(String nameArg)
    {
        name = nameArg;
    }

    //setter function for notes
    public void setNotes(String notesArg)
    {
        notes = notesArg;
    }

    //setter function for totalMarks
    public void setTotalMarks(int totalMarksArg)
    {
        totalMarks = totalMarksArg;
    }

    //setter function for assignmentId
    public void setAssignmentId(String assignmentIdArg) {
        assignmentId = assignmentIdArg;
    }

    //getter function for name
    public String getName() {
        return name;
    }

    //getter function for notes
    public String getNotes() {
        return notes;
    }

    //getter function for totalMarks
    public int getTotalMarks() {
        return totalMarks;
    }

    //getter function for assignmentId
    public String getAssignmentId() {
        return assignmentId;
    }
}
