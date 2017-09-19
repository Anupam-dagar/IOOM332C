package com.company.assignment1ques4;

//class definition of typeTwo assignment
public class typeTwo {
    //variable declaration
    private int totalTime;
    private int penalty;
    private String language;
    private int totalCorrectMarks;
    private int marksGiven;
    private String assignmentId;

    //typeTwo class constructor
    public typeTwo(int totalTimeArg, int penaltyArg, String languageArg, int totalCorrectMarksArg, String assignmentIdArg) {
        totalTime = totalTimeArg;
        penalty = penaltyArg;
        language = languageArg;
        totalCorrectMarks = totalCorrectMarksArg;
        marksGiven = totalCorrectMarksArg - penaltyArg;
        assignmentId = assignmentIdArg;
    }

    //setter function for totalTime
    public void setTotalTime(int totalTimeArg) {
        totalTime = totalTimeArg;
    }

    //setter function for penalty
    public void setPenalty(int penaltyArg) {
        penalty = penaltyArg;
    }

    //setter function for language
    public void setLanguage(String languageArg) {
        language = languageArg;
    }

    //setter function for totalCorrectMarks
    public void setTotalCorrectMarks(int totalCorrectMarksArg) {
        totalCorrectMarks = totalCorrectMarksArg;
    }

    //setter function for marksGiven
    public void setMarksGiven(int totalCorrectMarksArg, int penaltyArg) {
        marksGiven = totalCorrectMarksArg - penaltyArg;
    }

    //setter function for assignmentId
    public void setAssignmentId(String assignmentIdArg) {
        assignmentId = assignmentIdArg;
    }

    //getter function for totalTime
    public int getTotalTime() {
        return totalTime;
    }

    //getter function for penalty
    public int getPenalty() {
        return penalty;
    }

    //getter function for language
    public String getLanguage() {
        return language;
    }

    //getter function for totalCorrectMarks
    public int getTotalCorrectMarks() {
        return totalCorrectMarks;
    }

    //getter function for marksGiven
    public int getMarksGiven() {
        return marksGiven;
    }

    //getter function for assignmentId
    public String getAssignmentId() {
        return assignmentId;
    }
}
