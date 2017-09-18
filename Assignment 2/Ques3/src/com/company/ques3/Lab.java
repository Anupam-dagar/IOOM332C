package com.company.ques3;

public class Lab extends Course {
    private int viva;
    private int attendence;
    private int continuous;
    private int midMarks;
    private int endMarks;

    public Lab (int midMarks, int endMarks, String courseCode, int noOfCredits, String rollNo, int viva, int attendence, int continuous)
    {
        super(courseCode, noOfCredits, rollNo);
        this.midMarks = midMarks;
        this.endMarks = endMarks;
        this.viva = viva;
        this.attendence = attendence;
        this.continuous = continuous;
    }

    public void setViva(int viva) {
        this.viva = viva;
    }

    public void setAttendence(int attendence) {
        this.attendence = attendence;
    }

    public void setContinuous(int continuous) {
        this.continuous = continuous;
    }

    public int getViva() {
        return viva;
    }

    public int getAttendence() {
        return attendence;
    }

    public int getContinuous() {
        return continuous;
    }
}
