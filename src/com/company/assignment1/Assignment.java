package com.company.assignment1;

public class Assignment {
    private int difficulty;
    private Date deadline = new Date(0,0,0);
    private String assignmentId;
    private String courseId;
    private int baseMarks;

    public Assignment(int difficultyArg, Date deadlineArg, String assignmentIdArg, String courseIdArg, int baseMarksArg) {
        difficulty = difficultyArg;
        deadline = deadlineArg;
        assignmentId = assignmentIdArg;
        courseId = courseIdArg;
        baseMarks = baseMarksArg;
    }

    public void setDifficulty(int difficultyArg) {
        difficulty = difficultyArg;
    }

    public void setDeadline(Date deadlineArg) {
        deadline = deadlineArg;
    }

    public void setAssignmentId(String assignmentIdArg) {
        assignmentId = assignmentIdArg;
    }

    public void setCourseId(String courseIdArg) {
        courseId = courseIdArg;
    }

    public void setBaseMarks(int baseMarksArg) {
        baseMarks = baseMarksArg;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String  getAssignmentId() {
        return assignmentId;
    }

    public String  getCourseId() {
        return courseId;
    }

    public int getBaseMarks() {
        return baseMarks;
    }
}
