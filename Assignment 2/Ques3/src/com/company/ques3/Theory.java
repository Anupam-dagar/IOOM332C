package com.company.ques3;

public class Theory extends Course {
    private int assignment;
    private int quiz;
    private int internalAsses;
    private int attendence;
    private int midMarks;
    private int endMarks;

    public Theory (int midMarks, int endMarks, String courseCode, int noOfCredits, String rollNo, int assignment, int quiz, int internalAsses, int attendence)
    {
        super(courseCode, noOfCredits, rollNo);
        this.midMarks = midMarks;
        this.endMarks = endMarks;
        this.assignment = assignment;
        this.quiz = quiz;
        this.internalAsses = internalAsses;
        this.attendence = attendence;
    }

    public void setAttendence(int attendence) {
        this.attendence = attendence;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setInternalAsses(int internalAsses) {
        this.internalAsses = internalAsses;
    }

    public int getAttendence() {
        return attendence;
    }

    public int getAssignment() {
        return assignment;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getInternalAsses() {
        return internalAsses;
    }
}
