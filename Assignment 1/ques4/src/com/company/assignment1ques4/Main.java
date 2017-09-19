package com.company.assignment1ques4;

import java.util.Scanner;
//main class
public class Main {
    //main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        //loop to run testcases
        while (testCases > 0)
        {
            //variable j, k and z to insert in array of assignment typeZero, typeOne and typeTwo respectively
            int j = 0;
            int k = 0;
            int z = 0;
            String rollNo = scan.next();
            String name = scan.next();
            Student student = new Student(rollNo, name);
            int noOfAssignments = scan.nextInt();
            //array declaration for each type of assignment
            typeZero[] assignmentZeroArray = new typeZero[noOfAssignments];
            typeOne[] assignmentOneArray = new typeOne[noOfAssignments];
            typeTwo[] assignmentTwoArray = new typeTwo[noOfAssignments];
            //scanning respective assignment values
            for (int i = 0; i < noOfAssignments; i++)
            {
                String assignmentId = scan.next();
                int assignmentType = scan.nextInt();
                if (assignmentType == 0)
                {
                    String checker = scan.next();
                    String notes = scan.next();
                    int totalMarks = scan.nextInt();
                    typeZero assignmentZero = new typeZero(checker, notes, totalMarks, assignmentId);
                    assignmentZeroArray[j] = assignmentZero;
                    j++;
                }
                else if ( assignmentType == 1)
                {
                    int noOfCorrectQuestions = scan.nextInt();
                    int noOfIncorrectQuestions = scan.nextInt();
                    typeOne assignmentOne = new typeOne(noOfCorrectQuestions, noOfIncorrectQuestions, assignmentId);
                    assignmentOneArray[k] = assignmentOne;
                    k++;
                }
                else
                {
                    int totalTime = scan.nextInt();
                    int penalty = scan.nextInt();
                    String language = scan.next();
                    int totalCorrectMarks = scan.nextInt();
                    typeTwo assignmentTwo = new typeTwo(totalTime, penalty, language, totalCorrectMarks, assignmentId);
                    assignmentTwoArray[z] = assignmentTwo;
                    z++;
                }

            }
            //output
	    student.setSumZero();
            System.out.println(student.getRollno() + " " + student.getName());
            for (int i = 0; i < assignmentZeroArray.length; i++)
            {
                if (assignmentZeroArray[i] != null) {
                    student.setSum(assignmentZeroArray[i].getTotalMarks());
                    System.out.println(assignmentZeroArray[i].getAssignmentId() + " " + assignmentZeroArray[i].getTotalMarks());
                }
            }
            System.out.println(student.getSum());
            student.setSumZero();
            for (int i = 0; i < assignmentOneArray.length; i++)
            {
                if (assignmentOneArray[i] != null)
                {
                    student.setSum(assignmentOneArray[i].getTotalMarks());
                    System.out.println(assignmentOneArray[i].getAssignmentId() + " " + assignmentOneArray[i].getTotalMarks());
                }
            }
            System.out.println(student.getSum());
            student.setSumZero();
            for (int i = 0; i < assignmentTwoArray.length; i++)
            {
                if (assignmentTwoArray[i] != null)
                {
                    student.setSum(assignmentTwoArray[i].getMarksGiven());
                    System.out.println(assignmentTwoArray[i].getAssignmentId() + " " + assignmentTwoArray[i].getMarksGiven());
                }
            }
            System.out.println(student.getSum());
            testCases--;
        }
        scan.close();
    }
}
