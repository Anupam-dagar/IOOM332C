package com.company.ques2;

public class Student {
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

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setIsPass(boolean passArg) {
        isPass = passArg;
    }

    public boolean getIsPass() {
        return isPass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCgpa() {
        cgpa = (int)((tempSum/credits) + 0.5);
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public int getDuration() {
        return duration;
    }

    public String getGrade() {
        return grade;
    }

    public int getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setTotalGrad(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++)
        {
            if (studentArray[i].getName() != null)
            {
                totalGrad = totalGrad + 1;
            }
        }
    }

    public int getTotalGrad() {
        return totalGrad;
    }

    public int getCredits() {
        return credits;
    }

    public void increaseCredits(int creditArg)
    {
        credits = credits + creditArg;
    }

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

    public double getTempSum() {
        return tempSum;
    }

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

    public int getCount() {
        return count;
    }
}
