package com.company.ques1;

import java.util.Scanner;
//main class
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        while(testcases-- > 0)
        {
            //variable declaration
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
                String fixedString = scan.next(); //scan course of student
                studentArray[i] = new Student();
                studentArray[i].setCourse(fixedString);
                //input for UG course
                if (fixedString.compareTo("UG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    UG ug = new UG(name, rollNo, studentArray[i].getCourse(), duration, credits, department, cgpa);
                    if (ug.canGraduate(ug))
                    {

                        studentArray[i] = ug;
                        studentArray[i].setCgpa(cgpa);
                        studentArray[i].setDepartment(department);
                    }
                }
                //input for PG course
                if (fixedString.compareTo("PG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    thesisArea = scan.next();
                    PG pg = new PG(name, rollNo, studentArray[i].getCourse(), duration, credits, department, specialisation, cgpa, thesisArea);
                    if (pg.canGraduate(pg))
                    {
                        studentArray[i] = pg;
                        studentArray[i].setCgpa(cgpa);
                        studentArray[i].setDepartment(department);
                        studentArray[i].setSpecialization(specialisation);
                    }
                }
                //input for UG+PG course
                if (fixedString.compareTo("UG+PG") == 0)
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
                    UG_PG ugpg = new UG_PG(name, rollNo, studentArray[i].getCourse(), duration, credits, specialisation, cgpa, thesisArea, endYear, department);
                    if (ugpg.canGraduate(ugpg))
                    {
                        studentArray[i] = ugpg;
                        studentArray[i].setCgpa(cgpa);
                        studentArray[i].setDepartment(department);
                        studentArray[i].setSpecialization(specialisation);
                    }
                }
                //input for PhD course
                if (fixedString.compareTo("PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    credits = scan.nextInt();
                    thesisArea = scan.next();
                    Phd phd = new Phd(name, rollNo, studentArray[i].getCourse(), duration, credits, thesisArea);
                    if (phd.canGraduate(phd))
                    {
                        studentArray[i] = phd;
                    }
                }
                //input for Pg+PhD course
                if (fixedString.compareTo("PG+PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    cgpa = scan.nextInt();
                    credits = scan.nextInt();
                    thesisArea = scan.next();
                    endYear = scan.nextInt();
                    PG_Phd pg_phd = new PG_Phd(name, rollNo, studentArray[i].getCourse(), duration, credits, cgpa, thesisArea, endYear);
                    if (pg_phd.canGraduate(pg_phd))
                    {
                        studentArray[i] = pg_phd;
                        studentArray[i].setCgpa(cgpa);
                    }
                }
            }
            //output
            Student student = new Student();
            student.setTotalGrad(studentArray);
            System.out.println(student.getTotalGrad());
            for (int i = 0; i < studentArray.length ; i++)
            {
                if (studentArray[i].getName() != null)
                {
                    if (studentArray[i].getCourse().compareTo("UG") == 0)
                    {
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getCgpa());
                    }
                if (studentArray[i].getCourse().compareTo("PG") == 0)
                {
                    System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getSpecialization() + " " + studentArray[i].getCgpa());
                }
                if (studentArray[i].getCourse().compareTo("UG+PG") == 0)
                {
                    System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getSpecialization() + " " + studentArray[i].getCgpa());
                }
                if (studentArray[i].getCourse().compareTo("PhD") == 0)
                {
                    System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse());
                }
                if (studentArray[i].getCourse().compareTo("PG+PhD") == 0)
                {
                    System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getCgpa());
                }
                }
            }
        }
    }
}
