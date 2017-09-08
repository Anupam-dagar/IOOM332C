package com.company.ques2;
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
            String thesisArea;
            String specialisation;
            int endYear;
            String courseCode;
            int credits;
            int attendence;
            String grade;
            int n = scan.nextInt(); //n is number of students
            Student[] studentArray = new Student[n];
            for (int i = 0; i < n ; i++)
            {
                String fixedString = scan.next();
                studentArray[i] = new Student();
                studentArray[i].setCourse(fixedString);
                if (fixedString.compareTo("UG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    UG ug = new UG(name, rollNo, studentArray[i].getCourse(), duration);
                    studentArray[i] = ug;
                    studentArray[i].setCgpa(cgpa);
                    studentArray[i].setDepartment(department);
                }
                if (fixedString.compareTo("PG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    thesisArea = scan.next();
                    PG pg = new PG(name, rollNo, studentArray[i].getCourse(), duration, department, specialisation, thesisArea);
                    studentArray[i] = pg;
                    studentArray[i].setCgpa(cgpa);
                    studentArray[i].setDepartment(department);
                    studentArray[i].setSpecialization(specialisation);
                }
                if (fixedString.compareTo("UG+PG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    thesisArea = scan.next();
                    endYear = scan.nextInt();
                    UG_PG ugpg = new UG_PG(name, rollNo, studentArray[i].getCourse(), duration, specialisation, thesisArea, endYear, department);
                    studentArray[i] = ugpg;
                    studentArray[i].setDepartment(department);
                    studentArray[i].setSpecialization(specialisation);
                }
                if (fixedString.compareTo("PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    thesisArea = scan.next();
                    Phd phd = new Phd(name, rollNo, studentArray[i].getCourse(), duration, thesisArea);
                        studentArray[i] = phd;
                }
                if (fixedString.compareTo("PG+PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    thesisArea = scan.next();
                    endYear = scan.nextInt();
                    PG_Phd pg_phd = new PG_Phd(name, rollNo, studentArray[i].getCourse(), duration, thesisArea, endYear);
                    if (pg_phd.canGraduate(pg_phd))
                    {
                        studentArray[i] = pg_phd;
                        studentArray[i].setCgpa(cgpa);
                    }
                }
            }
            int m = scan.nextInt();
            for (int i = 0; i < m; i++)
            {
                courseCode = scan.next();
                credits  = scan.nextInt();
                rollNo = scan.next();
                attendence = scan.nextInt();
                grade = scan.next();
            }
        }
    }
}
