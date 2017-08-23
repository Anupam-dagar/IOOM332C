package com.company.assignment1ques6;

import java.util.Scanner;

//main class
public class Main {
    //main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int testCases = scan.nextInt();

        //loop to run testcases
        while (testCases > 0) {
            //check is counter to print student data through object of batch class
            int check = 0;
            //m is number of students
            int m = scan.nextInt();
            Batch batch = new Batch(m);
            for (int l = 0; l < m; l++) {
                String rollNo = scan.next();
                String name = scan.next();
                batch.getStudentarray()[l] = new Student(rollNo, name);
            }
            for (int l = 0; l < m; l++) {
                //sum variable for calculating total marks in each assignment
                sum = 0;
                //variable j, k and z to insert in array of assignment typeZero, typeOne and typeTwo respectively
                int j = 0;
                int k = 0;
                int z = 0;
                int noOfAssignments = scan.nextInt();
                //array declaration for each type of assignment
                typeZero[] assignmentZeroArray = new typeZero[noOfAssignments];
                typeOne[] assignmentOneArray = new typeOne[noOfAssignments];
                typeTwo[] assignmentTwoArray = new typeTwo[noOfAssignments];
                String[] assignmentIdarray = new String[noOfAssignments];
                int[] marksArray = new int[noOfAssignments];
                //scanning respective assignment values
                for (int i = 0; i < noOfAssignments; i++) {
                    String assignmentId = scan.next();
                    assignmentIdarray[i] = assignmentId;
                    int assignmentType = scan.nextInt();
                    if (assignmentType == 0) {
                        String checker = scan.next();
                        String notes = scan.next();
                        int totalMarks = scan.nextInt();
                        typeZero assignmentZero = new typeZero(checker, notes, totalMarks, assignmentId);
                        assignmentZeroArray[j] = assignmentZero;
                        marksArray[i] = totalMarks;
                        j++;
                    } else if (assignmentType == 1) {
                        int noOfCorrectQuestions = scan.nextInt();
                        int noOfIncorrectQuestions = scan.nextInt();
                        typeOne assignmentOne = new typeOne(noOfCorrectQuestions, noOfIncorrectQuestions, assignmentId);
                        assignmentOneArray[k] = assignmentOne;
                        marksArray[i] = assignmentOne.getTotalMarks();
                        k++;
                    } else {
                        int totalTime = scan.nextInt();
                        int penalty = scan.nextInt();
                        String language = scan.next();
                        int totalCorrectMarks = scan.nextInt();
                        typeTwo assignmentTwo = new typeTwo(totalTime, penalty, language, totalCorrectMarks, assignmentId);
                        assignmentTwoArray[z] = assignmentTwo;
                        marksArray[i] = assignmentTwo.getMarksGiven();
                        z++;
                    }

                }
                //output
                //calculating grandtotal in sum
                for (int i = 0; i < assignmentZeroArray.length; i++) {
                    if (assignmentZeroArray[i] != null) {
                        sum = sum + assignmentZeroArray[i].getTotalMarks();
                    }
                }
                for (int i = 0; i < assignmentOneArray.length; i++) {
                    if (assignmentOneArray[i] != null) {
                        sum = sum + assignmentOneArray[i].getTotalMarks();
                    }
                }
                for (int i = 0; i < assignmentTwoArray.length; i++) {
                    if (assignmentTwoArray[i] != null) {
                        sum = sum + assignmentTwoArray[i].getMarksGiven();
                    }
                }
                System.out.println(batch.getStudentarray()[check].getRollno() + " " + batch.getStudentarray()[check].getName());
                System.out.println(sum);
                for (int i = 0; i < noOfAssignments; i++)
                {
                    System.out.println(assignmentIdarray[i] + " " + marksArray[i]);
                }
                check++;
            }

            testCases--;
        }
        scan.close();
    }
}
