package com.company.assignment1ques3;
//Assignment class which contains all information about the assignment
public class Assignment {
    //variable declaration
    private int difficulty;
    private Date deadline = new Date(0,0,0);
    private String assignmentId;
    private String courseId;
    private int baseMarks;

    //Assignment class constructor without arguments
    public Assignment(){
        difficulty = 1;
        assignmentId = "";
        courseId = "";
        baseMarks = 1;
        deadline = deadline;
    }

    //Assignment class constructor with arguments
    public Assignment(int difficultyArg, Date deadlineArg, String assignmentIdArg, String courseIdArg, int baseMarksArg) {
        difficulty = difficultyArg;
        deadline = deadlineArg;
        assignmentId = assignmentIdArg;
        courseId = courseIdArg;
        baseMarks = baseMarksArg;
    }

    //function to set difficulty of the assignment
    public void setDifficulty(int difficultyArg) {
        difficulty = difficultyArg;
    }

    //function to set deadline of the assignment
    public void setDeadline(Date deadlineArg) {
        deadline = deadlineArg;
    }

    //function to set assignment ID of the assignment
    public void setAssignmentId(String assignmentIdArg) {
        assignmentId = assignmentIdArg;
    }

    //function to set course ID of the assignment
    public void setCourseId(String courseIdArg) {
        courseId = courseIdArg;
    }

    //function to set base marks of the assignment
    public void setBaseMarks(int baseMarksArg) {
        baseMarks = baseMarksArg;
    }

    //function to get difficulty of assignment
    public int getDifficulty() {
        return difficulty;
    }

    //function to get deadline of assignment
    public Date getDeadline() {
        return deadline;
    }

    //function to get assignment ID of assignment
    public String  getAssignmentId() {
        return assignmentId;
    }

    //function to get course ID of assignment
    public String  getCourseId() {
        return courseId;
    }

    //function to get base marks of assignment
    public int getBaseMarks() {
        return baseMarks;
    }
}
