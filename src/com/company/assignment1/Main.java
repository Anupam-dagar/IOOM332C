package com.company.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        Date temporary;
        while (testCases > 0)
        {
            String roll = scan.next();
            String name = scan.next();
            int intelligence = scan.nextInt();
            Student student = new Student(roll,name,intelligence);
            int noOfAssignments = scan.nextInt();
            Date[] deadlineArray = new Date[noOfAssignments];
            for (int i = 0; i < noOfAssignments; i++)
            {
                String assignId = scan.next();
                String course = scan.next();
                int day = scan.nextInt();
                int month = scan.nextInt();
                int year = scan.nextInt();
                int baseMark = scan.nextInt();
                int diff = scan.nextInt();
                Date deadline = new Date(day,month,year);
                Assignment assignment = new Assignment(diff, deadline, assignId, course, baseMark);
                deadlineArray[i] = deadline;
                System.out.println(assignment.getDeadline());

            }
            scan.close();
            System.out.println(deadlineArray.length);
            for (int i = 0; i < deadlineArray.length; i++)
            {
                System.out.println(deadlineArray[i]);
            }
            for (int i = 0; i < deadlineArray.length; i++)
            {
                for (int j = 0; j < deadlineArray.length; j++)
                {
                    if(deadlineArray[i].getYear() > deadlineArray[j].getYear())
                    {
                        temporary = deadlineArray[i];
                        deadlineArray[i] = deadlineArray[j];
                        deadlineArray[j] = temporary;
                    }
                    else if (deadlineArray[i].getYear() == deadlineArray[j].getYear())
                    {
                        if (deadlineArray[i].getMonth() < deadlineArray[j].getMonth())
                        {
                            temporary = deadlineArray[i];
                            deadlineArray[i] = deadlineArray[j];
                            deadlineArray[j] = temporary;
                        }
                        else if (deadlineArray[i].getMonth() == deadlineArray[j].getMonth())
                        {
                            if (deadlineArray[i].getDay() < deadlineArray[j].getDay())
                            {
                                temporary = deadlineArray[i];
                                deadlineArray[i] = deadlineArray[j];
                                deadlineArray[j] = temporary;
                            }
                        }
                    }
                }
            }

            testCases--;
        }


    }
}
