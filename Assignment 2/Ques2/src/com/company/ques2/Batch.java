package com.company.ques2;

public class Batch {
    private Student[] studentArray;
    private Graduate[] gradArray;

    public Batch (int studentArraySize, int gradArraySize) {
        studentArray = new Student[studentArraySize];
        gradArray = new Graduate[gradArraySize];
    }

    public void setGradArray(int gradArraySize) {
        gradArray = new Graduate[gradArraySize];
    }

    public void setStudentArray(int studentArraySize) {
        studentArray = new Student[studentArraySize];
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public Graduate[] getGradArray() {
        return gradArray;
    }
}
