package com.company.ques2;

public class Graduate {
    private String courseCode;
    private String rollNo;
    private boolean isPass;
    private int credits;
    private String grade;
    private int cgpa;
    private int totalCredits;

    public Graduate(){}

    public Graduate (String courseCode,String rollNo, boolean isPass)
    {
        this.courseCode = courseCode;
        this.rollNo = rollNo;
        this.isPass = isPass;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setIsPass(boolean passArg) {
        isPass = passArg;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public boolean isPass() {
        return isPass;
    }

    public int getCredits() {
        return credits;
    }

    public String getGrade() {
        return grade;
    }

    public void increaseCredits(int creditArg)
    {
        totalCredits = totalCredits + creditArg;
    }

    public void setCgpa(Graduate[] gradArray)
    {
        cgpa = 0;
        double x = 0;
        double temp = 0;
        for (int i = 0; i < gradArray.length; i++) {
                System.out.println(grade);
                if (grade.compareTo("A+") == 0) {
                    x = 10.0;
                }
                if (grade.compareTo("A") == 0) {
                    x = 9.0;
                }
                if (grade.compareTo("B+") == 0) {
                    x = 8.0;
                }
                if (grade.compareTo("B") == 0) {
                    x = 7.0;
                }
                if (grade.compareTo("C") == 0) {
                    x = 6.0;
                }
                if (grade.compareTo("D") == 0) {
                    x = 5.0;
                }

                temp = temp + totalCredits * x;
                System.out.println(temp + " " + totalCredits + " " + x);
        }
        temp = Math.ceil(temp/totalCredits);
        cgpa = (int)temp;
    }

    public int getCgpa() {
        return cgpa;
    }
}
