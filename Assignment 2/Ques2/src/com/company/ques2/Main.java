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
                    UG ug = new UG(name, rollNo, studentArray[i].getCourse(), duration);
                    if (duration >=4 && duration <= 7)
                    {
                        studentArray[i] = ug;
                        studentArray[i].setDepartment(department);
                    }
                }
                if (fixedString.compareTo("PG") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    department = scan.next();
                    specialisation = scan.next();
                    duration = scan.nextInt();
                    thesisArea = scan.next();
                    PG pg = new PG(name, rollNo, studentArray[i].getCourse(), duration, department, specialisation, thesisArea);
                    if (duration >= 2 && duration <= 4)
                    {
                        studentArray[i] = pg;
                        studentArray[i].setDepartment(department);
                        studentArray[i].setSpecialization(specialisation);
                    }
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
                    if (duration >= 5 && duration <= 8)
                    {
                        studentArray[i] = ugpg;
                        studentArray[i].setDepartment(department);
                        studentArray[i].setSpecialization(specialisation);
                    }
                }
                if (fixedString.compareTo("PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    thesisArea = scan.next();
                    Phd phd = new Phd(name, rollNo, studentArray[i].getCourse(), duration, thesisArea);
                    if (duration >= 2 && duration <= 6)
                    {
                        studentArray[i] = phd;
                    }
                }
                if (fixedString.compareTo("PG+PhD") == 0)
                {
                    rollNo = scan.next();
                    name = scan.next();
                    duration = scan.nextInt();
                    thesisArea = scan.next();
                    endYear = scan.nextInt();
                    PG_Phd pg_phd = new PG_Phd(name, rollNo, studentArray[i].getCourse(), duration, thesisArea, endYear);
                    if (duration >= 4 && duration <= 7)
                    {
                        studentArray[i] = pg_phd;
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
                int studentIndex = 0;
                for (int j = 0; j < studentArray.length; j++) {
                    if (studentArray[j].getRollNo().compareTo(rollNo) == 0)
                    {
                        studentIndex = j;
                        break;
                    }
                }
                if (attendence >= 75 && grade.compareTo("F") != 0)
                {
                    studentArray[studentIndex].setGrade(grade);
                    studentArray[studentIndex].setTempSum(credits, grade);
                    studentArray[studentIndex].increaseCredits(credits);
                }
            }

            Student student = new Student();
            student.setCount(studentArray);
            System.out.println(student.getCount());
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getCourse().compareTo("UG") == 0) {
                    if (studentArray[i].getCredits() >= 185) {
                        studentArray[i].setCgpa();
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getCgpa());
                    }
                }
                if (studentArray[i].getCourse().compareTo("PG") == 0) {
                    if (studentArray[i].getCredits() >= 80){
                        studentArray[i].setCgpa();
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getSpecialization() + " " + studentArray[i].getCgpa());
                    }
                }
                if (studentArray[i].getCourse().compareTo("UG+PG") == 0) {
                    if (studentArray[i].getCredits() >= 265) {
                        studentArray[i].setCgpa();
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getDepartment() + " " + studentArray[i].getSpecialization() + " " + studentArray[i].getCgpa());
                    }
                }
                if (studentArray[i].getCourse().compareTo("PhD") == 0) {
                    if (studentArray[i].getCredits() >= 64) {
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse());
                    }
                }
                if (studentArray[i].getCourse().compareTo("PG+PhD") == 0) {
                    if (studentArray[i].getCredits() >= 138) {
                        studentArray[i].setCgpa();
                        System.out.println(studentArray[i].getRollNo() + " " + studentArray[i].getName() + " " + studentArray[i].getCourse() + " " + studentArray[i].getCgpa());
                    }
                }
            }
        }
    }
}
