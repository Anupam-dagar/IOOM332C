package com.company.assignment1ques3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int totalMarks = 0;
        Assignment assignment = new Assignment();

        //loop to scan values and create objects
        while (testCases > 0)
        {
            String roll = "";
            String name = "";
            int intelligence = 0;
            int type = -1;
            int m = scan.nextInt();
            Batch batch = new Batch(m);
            for (int i = 0; i < m; i++)
            {
                roll = scan.next();
                name = scan.next();
                intelligence = scan.nextInt();
                type = scan.nextInt();
                batch.getStudentarray()[i] = new Student(roll, name, intelligence, type);
            }

            int noOfAssignments = scan.nextInt();
            Assignment[] assignmentArray = new Assignment[noOfAssignments];
            for (int i = 0; i < noOfAssignments; i++)
            {
                String assignId = scan.next();
                String course = scan.next();
                int day = scan.nextInt();
                int month = scan.nextInt();
                int year = scan.nextInt();
                int baseMark = scan.nextInt();
                int diff = scan.nextInt();

                //creating objects
                Date deadline = new Date(day,month,year);
                assignment = new Assignment(diff, deadline, assignId, course, baseMark);

                //insert assignment object in an array
                assignmentArray[i] = assignment;

            }
            int p = scan.nextInt();
            plagiarism[] plagArray = new plagiarism[p];
            for (int i = 0; i < p; i++)
            {
                String plagRollNo = scan.next();
                String plagCourse = scan.next();
                plagiarism plag = new plagiarism(plagRollNo, plagCourse);
                plagArray[i] = plag;
            }

            //output
            for (int i = 0; i < m; i++)
            {
                totalMarks = 0;
                System.out.println(batch.getStudentarray()[i].getRollNo() + " " + batch.getStudentarray()[i].getName());
                if (batch.getStudentarray()[i].getType() == 0)
                {
                    sort.sortarray(assignmentArray);
                }
                else if (batch.getStudentarray()[i].getType() == 1)
                {
                    sort.sort1(assignmentArray);
                }
                else
                {
                    sort.sort2(assignmentArray);
                }
                for (int l = 0; l < noOfAssignments; l++)
                {
                    if (batch.getStudentarray()[i].getIntelligence() >= assignmentArray[l].getDifficulty()) {
                        for (int k = 0; k < p; k++)
                        {
                            if (batch.getStudentarray()[i].getRollNo().compareTo(plagArray[k].getRollno()) == 0 && assignmentArray[l].getCourseId().compareTo(plagArray[k].getCourse()) == 0) {
                                batch.getStudentarray()[i].setMarksObtained(0, 0);
                                break;
                            }
                            else
                            {
                                batch.getStudentarray()[i].setMarksObtained(assignmentArray[l].getBaseMarks(), batch.getStudentarray()[i].getIntelligence());
                            }
                        }
                        totalMarks = totalMarks + batch.getStudentarray()[i].getMarksObtained();
                        System.out.println(assignmentArray[l].getAssignmentId() + " " + assignmentArray[l].getCourseId() + " " + batch.getStudentarray()[i].getMarksObtained());
                    }
                }
                System.out.println(totalMarks);
            }
            testCases--;
        }
        scan.close();
    }
}
