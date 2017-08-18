package com.company.assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases > 0)
        {
            String roll = scan.nextLine();
            String name = scan.nextLine();
            int intelligence = scan.nextInt();
            Student student = new Student(roll,name,intelligence);
            int noOfAssignments = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < noOfAssignments; i++)
            {
                String assignId = scan.nextLine();
                String course = scan.nextLine();
                int day = scan.nextInt();
                int month = scan.nextInt();
                int year = scan.nextInt();
                int baseMark = scan.nextInt();
                int diff = scan.nextInt();
                Date deadline = new Date(day,month,year);
                Assignment assignment = new Assignment(diff, deadline, assignId, course, baseMark);
                System.out.println(deadline.getDay());
                System.out.println(assignment.getDifficulty());
            }
            scan.close();
            testCases--;
        }


    }
}
