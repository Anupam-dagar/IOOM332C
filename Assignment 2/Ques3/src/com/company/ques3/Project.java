package com.company.ques3;

public class Project extends Course {
    private int[] midMarks;
    private int[] endMarks;
    private int supervisor;
    private int noOfPanelist;

    public Project (String courseCode, int noOfCredits, String rollNo, int supervisor, int noOfPanelist)
    {
        super(courseCode, noOfCredits, rollNo);
        midMarks = new int[noOfPanelist];
        endMarks = new int[noOfPanelist];
        this.supervisor = supervisor;
        this.noOfPanelist = noOfPanelist;
    }

    public void insertMidMarks(int index, int value)
    {
        midMarks[index] = value;
    }

    public void insertEndMarks(int index, int value)
    {
        endMarks[index] = value;
    }

    public void setMidMarks(int panelist) {
        midMarks = new int[panelist];
    }

    public void setEndMarks(int panelist) {
        endMarks = new int[panelist];
    }

    public void setSupervisor(int supervisor) {
        this.supervisor = supervisor;
    }

    public void setNoOfPanelist(int noOfPanelist) {
        this.noOfPanelist = noOfPanelist;
    }

    public int[] getMidMark() {
        return midMarks;
    }

    public int[] getEndMark() {
        return endMarks;
    }

    public int getSupervisor() {
        return supervisor;
    }

    public int getNoOfPanelist() {
        return noOfPanelist;
    }
}
