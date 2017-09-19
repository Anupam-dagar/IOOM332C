package com.company.ques3;
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
            int midSem;
            int endSem;
            int assesment;
            int assignment;
            int quiz;
            int viva;
            int continuous;
            int supervisor;
            int noOfPanelist;
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
            int counterT = 0;
            int counterL = 0;
            int counterP = 0;
            int studentIndex;
            for (int i = 0; i < studentArray.length; i++) {
                studentArray[i].setCourseArray(m);
            }
            for (int i = 0; i < m; i++)
            {
                String fixedString = scan.next();
                if (fixedString.compareTo("T") == 0)
                {
                    courseCode = scan.next();
                    credits = scan.nextInt();
                    rollNo = scan.next();
                    attendence = scan.nextInt();
                    midSem = scan.nextInt();
                    endSem = scan.nextInt();
                    assignment = scan.nextInt();
                    quiz = scan.nextInt();
                    assesment = scan.nextInt();
                    Theory theory = new Theory(midSem, endSem, courseCode, credits, rollNo, assignment, quiz, assesment, attendence);
                    studentIndex = studentArray[i].studentSearch(studentArray, rollNo);
                    studentArray[studentIndex].getCourseArray()[counterT] = new Course();
                    studentArray[studentIndex].getCourseArray()[counterT] = theory;
                    studentArray[studentIndex].getCourseArray()[counterT].setMidMarks(midSem);
                    studentArray[studentIndex].getCourseArray()[counterT].setEndMarks(endSem);
                    studentArray[studentIndex].getCourseArray()[counterT].setAssignment(assignment);
                    studentArray[studentIndex].getCourseArray()[counterT].setQuiz(quiz);
                    studentArray[studentIndex].getCourseArray()[counterT].setAssessment(assesment);
                    studentArray[studentIndex].getCourseArray()[counterT].setAttendence(attendence);
                    studentArray[studentIndex].increaseCounter(counterT);
                }
                if (fixedString.compareTo("L") == 0)
                {
                    courseCode = scan.next();
                    credits = scan.nextInt();
                    rollNo = scan.next();
                    attendence = scan.nextInt();
                    midSem = scan.nextInt();
                    endSem = scan.nextInt();
                    viva = scan.nextInt();
                    continuous = scan.nextInt();
                    Lab lab = new Lab(midSem, endSem, courseCode, credits, rollNo, viva, attendence, continuous);
                    studentIndex = studentArray[i].studentSearch(studentArray, rollNo);
                    studentArray[studentIndex].getCourseArray()[counterL] = new Course();
                    studentArray[studentIndex].getCourseArray()[counterL] = lab;
                    studentArray[studentIndex].getCourseArray()[counterL].setViva(viva);
                    studentArray[studentIndex].getCourseArray()[counterL].setAttendence(attendence);
                    studentArray[studentIndex].getCourseArray()[counterL].setAssessment(continuous);
                    studentArray[studentIndex].getCourseArray()[counterL].setMidMarks(midSem);
                    studentArray[studentIndex].getCourseArray()[counterL].setEndMarks(endSem);
                    studentArray[studentIndex].increaseCounter(counterL);
                }
                if (fixedString.compareTo("P") == 0)
                {
                    courseCode = scan.next();
                    credits = scan.nextInt();
                    rollNo = scan.next();
                    supervisor = scan.nextInt();
                    noOfPanelist = scan.nextInt();
                    Project project = new Project(courseCode, credits, rollNo, supervisor, noOfPanelist);
                    studentIndex = studentArray[i].studentSearch(studentArray, rollNo);
                    studentArray[studentIndex].getCourseArray()[counterP] = new Course();
                    studentArray[studentIndex].getCourseArray()[counterP] = project;
                    studentArray[studentIndex].getCourseArray()[counterP].setMidSemArray(noOfPanelist);
                    studentArray[studentIndex].getCourseArray()[counterP].setEndSemArray(noOfPanelist);
                    for (int j = 0; j < noOfPanelist; j++) {
                        midSem = scan.nextInt();
                        endSem = scan.nextInt();
                        project.insertMidMarks(j,midSem);
                        project.insertEndMarks(j, endSem);
                        studentArray[studentIndex].getCourseArray()[counterP].insertMidSem(midSem, j);
                        studentArray[studentIndex].getCourseArray()[counterP].insertEndSem(endSem, j);
                    }
                    studentArray[studentIndex].increaseCounter(counterP);
                }
            }

            for (int i = 0; i < studentArray.length; i++)
            {
                studentArray[i].computeResult(studentArray);
            }

        }
    }
}
