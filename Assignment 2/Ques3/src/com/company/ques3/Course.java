package com.company.ques3;

public class Course {
    private String courseCode;
    private int noOfCredits;
    private String rollNo;
    private int midMarks;
    private int endMarks;
    private int viva;
    private int assignment;
    private int quiz;
    private int assessment;
    private int attendence;
    private int[] midSemArray;
    private int[] endSemArray;

    public Course(){}

    public Course (String courseCode, int noOfCredits, String rollNo)
    {
        this.courseCode = courseCode;
        this.noOfCredits = noOfCredits;
        this.rollNo = rollNo;
    }

    public void setMidSemArray(int size) {
        midSemArray = new int[size];
    }

    public void setEndSemArray(int size) {
        endSemArray = new int[size];
    }

    public void insertMidSem(int value, int index)
    {
        midSemArray[index] = value;
    }

    public void insertEndSem(int value, int index)
    {
        endSemArray[index] = value;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setMidMarks(int midMarks) {
        this.midMarks = midMarks;
    }

    public void setEndMarks(int endMarks) {
        this.endMarks = endMarks;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public void setViva(int viva) {
        this.viva = viva;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public void setAttendence(int attendence) {
        this.attendence = attendence;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getViva() {
        return viva;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getAssignment() {
        return assignment;
    }

    public int getEndMarks() {
        return endMarks;
    }

    public int getMidMarks() {
        return midMarks;
    }

    public int getAssessment() {
        return assessment;
    }

    public int getAttendence() {
        return attendence;
    }

    public int[] getMidSemArray() {
        return midSemArray;
    }

    public int[] getEndSemArray() {
        return endSemArray;
    }
}
