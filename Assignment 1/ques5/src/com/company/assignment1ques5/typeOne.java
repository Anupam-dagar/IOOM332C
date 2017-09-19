package com.company.assignment1ques5;

//class definition of typeOne assignment
public class typeOne {
    private int correctMarks;
    private int negativeMarks;
    private int totalCorrect;
    private int totalIncorrect;
    private int totalMarks;
    private String assignmentId;

    //typeOne class constructor
    public typeOne(int totalCorrectArg, int totalIncorrectArg, String assignmentIdArg)
    {
        correctMarks = 4;
        negativeMarks = -1;
        totalCorrect = totalCorrectArg;
        totalIncorrect = totalIncorrectArg;
        totalMarks = (totalCorrectArg * 4) - totalIncorrectArg;
        assignmentId = assignmentIdArg;
    }

    //setter function for correctMarks
    public void setCorrectMarks()
    {
        correctMarks = 4;
    }

    //setter function for negativeMarks
    public void setNegativeMarks()
    {
        negativeMarks = -1;
    }

    //setter function for totalCorrect
    public void setTotalCorrect(int totalCorrectArg)
    {
        totalCorrect = totalCorrectArg;
    }

    //setter function for totalIncorrect
    public void setTotalIncorrect(int totalIncorrectArg)
    {
        totalIncorrect = totalIncorrectArg;
    }

    //setter function for totalMarks
    public void setTotalMarks(int totalCorrectArg, int totalIncorrectArg)
    {
        totalMarks = (totalCorrectArg * 4) - totalIncorrectArg;
    }

    //setter function for assignmentId
    public void setAssignmentId(String assignmentIdArg) {
        assignmentId = assignmentIdArg;
    }

    //getter function for correctMarks
    public int getCorrectMarks()
    {
        return correctMarks;
    }

    //getter function for negativeMarks
    public int getNegativeMarks() {
        return negativeMarks;
    }

    //getter function for totalCorrect
    public int getTotalCorrect() {
        return totalCorrect;
    }

    //getter function for totalMarks
    public int getTotalMarks() {
        return totalMarks;
    }

    //getter function for totalIncorrect
    public int getTotalIncorrect() {
        return totalIncorrect;
    }

    //getter function for assignmentId
    public String getAssignmentId() {
        return assignmentId;
    }
}
