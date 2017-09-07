package com.company.ques1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        while(testcases-- > 0)
        {
            String rollNo;
            String name;
            String department;
            int duration;
            int cgpa;
            int credits;
            String thesisArea;
            String specialisation;
            int endYear;
            int n = scan.nextInt(); //n is number of students
            Student[] studentArray = new Student[n];
            for (int i = 0; i < n ; i++)
            {
                Student student = new Student();
                String fixedString = scan.next();
                student.setCourse(fixedString);
                if (student.getCourse() == "UG")
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    UG ug = new UG(name, rollNo, student.getCourse(), duration, credits, department, cgpa);
                    studentArray[i] = ug;
                }
                if (student.getCourse() == "PG")
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    thesisArea = scan.next();
                    PG pg = new PG(name, rollNo, student.getCourse(), duration, credits, department, specialisation, cgpa, thesisArea);
                    studentArray[i] = pg;
                }
                if (student.getCourse() == "UG+PG")
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    thesisArea = scan.next();
                    endYear = scan.nextInt();
                    UG_PG ugpg = new UG_PG(name, rollNo, student.getCourse(), duration, credits, specialisation, cgpa, thesisArea, endYear);
                    studentArray[i] = ugpg;
                }
            }
        }
    }
}
