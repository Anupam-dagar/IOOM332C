package com.company.assignment1;

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
            totalMarks = 0;
            String roll = scan.next();
            String name = scan.next();
            int intelligence = scan.nextInt();
            Student student = new Student(roll,name,intelligence);
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

            //sorting the assignment array according to deadline and if deadline is same then according to assignment ID
            sort(assignmentArray);

            //output
            System.out.println(student.getRollNo() + " " + student.getName());
            for (int i = 0; i < assignmentArray.length; i++)
            {
                if (student.getIntelligence() >= assignmentArray[i].getDifficulty())
                {
                    student.setMarksObtained(assignmentArray[i].getBaseMarks(), student.getIntelligence());
                    totalMarks = totalMarks + student.getMarksObtained();
                    System.out.println(assignmentArray[i].getAssignmentId() + " " + assignmentArray[i].getCourseId() + " " + student.getMarksObtained());
                }
            }
            System.out.println(totalMarks);
            testCases--;
        }
        scan.close();



    }
    //function to sort assignment array according to deadline and assignment ID
    public static void sort(Assignment[] assignmentArray)
    {
        Assignment temporary = new Assignment();
        for (int i = 0; i < assignmentArray.length - 1; i++)
        {
            for (int j = 0; j < assignmentArray.length - i - 1; j++)
            {
                if(assignmentArray[i].getDeadline().getYear() > assignmentArray[j].getDeadline().getYear())
                {
                    temporary = assignmentArray[j];
                    assignmentArray[j] = assignmentArray[j+1];
                    assignmentArray[j+1] = temporary;
                }
                else if (assignmentArray[j].getDeadline().getYear() == assignmentArray[j+1].getDeadline().getYear())
                {
                    if (assignmentArray[j].getDeadline().getMonth() > assignmentArray[j+1].getDeadline().getMonth())
                    {
                        temporary = assignmentArray[j];
                        assignmentArray[j] = assignmentArray[j+1];
                        assignmentArray[j+1] = temporary;
                    }
                    else if (assignmentArray[j].getDeadline().getMonth() == assignmentArray[j+1].getDeadline().getMonth())
                    {
                        if (assignmentArray[j].getDeadline().getDay() == assignmentArray[j+1].getDeadline().getDay())
                        {
                            if (assignmentArray[j].getAssignmentId().charAt(0) <= '9' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                            {
                                if(Integer.parseInt(assignmentArray[j].getAssignmentId()) > Integer.parseInt(assignmentArray[j+1].getAssignmentId()))
                                {
                                    temporary = assignmentArray[j];
                                    assignmentArray[j] = assignmentArray[j+1];
                                    assignmentArray[j+1] = temporary;
                                }
                            }
                            else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                            {
                                temporary = assignmentArray[j];
                                assignmentArray[j] = assignmentArray[j+1];
                                assignmentArray[j+1] = temporary;
                            }
                            else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) >= 'A')
                            {
                                if (assignmentArray[j].getAssignmentId().charAt(0) == assignmentArray[j+1].getAssignmentId().charAt(0))
                                {
                                    if (Integer.parseInt(assignmentArray[j].getAssignmentId().substring(1)) > Integer.parseInt(assignmentArray[j+1].getAssignmentId().substring(1)) )
                                    {
                                        temporary = assignmentArray[j];
                                        assignmentArray[j] = assignmentArray[j+1];
                                        assignmentArray[j+1] = temporary;
                                    }
                                }
                                if (assignmentArray[j].getAssignmentId().charAt(0) > assignmentArray[j+1].getAssignmentId().charAt(0))
                                {
                                    temporary = assignmentArray[j];
                                    assignmentArray[j] = assignmentArray[j+1];
                                    assignmentArray[j+1] = temporary;
                                }

                            }

                        }
                        else if (assignmentArray[j].getDeadline().getDay() > assignmentArray[j+1].getDeadline().getDay())
                        {
                            temporary = assignmentArray[j];
                            assignmentArray[j] = assignmentArray[j+1];
                            assignmentArray[j+1] = temporary;
                        }
                    }
                }
            }
        }
    }
}
