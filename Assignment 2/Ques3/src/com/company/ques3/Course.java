package com.company.ques3;

public class Course {
    private String courseCode;
    private int noOfCredits;
    private String rollNo;

    public Course(){}

    public Course (String courseCode, int noOfCredits, String rollNo)
    {
        this.courseCode = courseCode;
        this.noOfCredits = noOfCredits;
        this.rollNo = rollNo;
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

    public String getCourseCode() {
        return courseCode;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public String getRollNo() {
        return rollNo;
    }
}
