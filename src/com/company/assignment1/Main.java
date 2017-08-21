package com.company.assignment1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Date> deadlineArray = new ArrayList<Date>();
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases > 0)
        {
            String roll = scan.next();
            String name = scan.next();
            int intelligence = scan.nextInt();
            Student student = new Student(roll,name,intelligence);
            int noOfAssignments = scan.nextInt();
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
                deadlineArray.add(deadline);
            }
            scan.close();
            for (int i = 0; i < deadlineArray.size(); i++)
            {
                System.out.println(deadlineArray.get(i));
            }
            testCases--;
        }


    }
}
