package com.company.ques2;
//student class (parent)
public class Student {
    //variable declaration
    private String name;
    private String rollNo;
    private String course;
    private int duration;
    private String department;
    private String specialization;
    private int cgpa;
    private int totalGrad;
    private String grade;
    private int credits;
    private boolean isPass;
    private String courseCode;
    private int totalCredits;
    private double tempSum;
    private int count;

    //constructor for Student class
    public Student(){}
    public Student (String name, String rollNo, String course, int duration)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.duration = duration;
        grade = null;
        credits = 0;
        isPass = false;
        courseCode = "";
        count = 0;
    }

    //setter function for courseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //getter function for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    //setter function for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    //setter function for isPass
    public void setIsPass(boolean passArg) {
        isPass = passArg;
    }

    //getter function for isPass
    public boolean getIsPass() {
        return isPass;
    }

    //setter function for name
    public void setName(String name) {
        this.name = name;
    }

    //setter function for rollNo
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    //setter function for course
    public void setCourse(String course) {
        this.course = course;
    }

    //setter function for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //setter function for credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //setter function for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //setter function for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //setter function for cgpa
    public void setCgpa() {
        cgpa = (int)((tempSum/credits) + 0.5);
    }

    //getter function for name
    public String getName() {
        return name;
    }

    //getter function for rollNo
    public String getRollNo() {
        return rollNo;
    }

    //getter function for course
    public String getCourse() {
        return course;
    }

    //getter function for duration
    public int getDuration() {
        return duration;
    }

    //getter function for grade
    public String getGrade() {
        return grade;
    }

    //getter function for cgpa
    public int getCgpa() {
        return cgpa;
    }

    //getter function for department
    public String getDepartment() {
        return department;
    }

    //getter function for specialization
    public String getSpecialization() {
        return specialization;
    }

    //setter function for totalGrad
    public void setTotalGrad(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++)
        {
            if (studentArray[i].getName() != null)
            {
                totalGrad = totalGrad + 1;
            }
        }
    }

    //getter function for totalGrad
    public int getTotalGrad() {
        return totalGrad;
    }

    //getter function for credits
    public int getCredits() {
        return credits;
    }

    //function to increase credits
    public void increaseCredits(int creditArg)
    {
        credits = credits + creditArg;
    }

    //setter function for tempSum
    public void setTempSum(int creditsArg, String gradeArg)
    {
        if (gradeArg.compareTo("A+") == 0) {
            tempSum = tempSum + creditsArg * 10.0;
        }
        if (gradeArg.compareTo("A") == 0) {
            tempSum = tempSum + creditsArg * 9.0;
        }
        if (gradeArg.compareTo("B+") == 0) {
            tempSum = tempSum + creditsArg * 8.0;
        }
        if (gradeArg.compareTo("B") == 0) {
            tempSum = tempSum + creditsArg * 7.0;
        }
        if (gradeArg.compareTo("C") == 0) {
            tempSum = tempSum + creditsArg * 6.0;
        }
        if (gradeArg.compareTo("D") == 0) {
            tempSum = tempSum + creditsArg * 5.0;
        }
    }

    //getter function for tempSum
    public double getTempSum() {
        return tempSum;
    }

    //setter funciton for count
    public void setCount(Student[] studentArray)
    {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getCourse().compareTo("UG") == 0) {
                if (studentArray[i].getCredits() >= 185) {
                    count = count + 1;
                }
            }
            if (studentArray[i].getCourse().compareTo("PG") == 0) {
                if (studentArray[i].getCredits() >= 80){
                    count = count + 1;
                }
            }
            if (studentArray[i].getCourse().compareTo("UG+PG") == 0) {
                if (studentArray[i].getCredits() >= 265) {
                    count = count + 1;
                }
            }
            if (studentArray[i].getCourse().compareTo("PhD") == 0) {
                if (studentArray[i].getCredits() >= 64) {
                    count = count + 1;
                }
            }
            if (studentArray[i].getCourse().compareTo("PG+PhD") == 0) {
                if (studentArray[i].getCredits() >= 138) {
                    count = count + 1;
                }
            }
        }
    }

    //getter function for count
    public int getCount() {
        return count;
    }
}
