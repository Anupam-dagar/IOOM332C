package com.company.assignment1ques5;

import java.util.Scanner;

//main class
public class Main {
    //main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                //variable j, k and z to insert in array of assignment typeZero, typeOne and typeTwo respectively
                int j = 0;
                int k = 0;
                int z = 0;
                int noOfAssignments = scan.nextInt();
                //array declaration for each type of assignment
                typeZero[] assignmentZeroArray = new typeZero[noOfAssignments];
                typeOne[] assignmentOneArray = new typeOne[noOfAssignments];
                typeTwo[] assignmentTwoArray = new typeTwo[noOfAssignments];
                //scanning respective assignment values
                for (int i = 0; i < noOfAssignments; i++) {
                    String assignmentId = scan.next();
                    int assignmentType = scan.nextInt();
                    if (assignmentType == 0) {
                        String checker = scan.next();
                        String notes = scan.next();
                        int totalMarks = scan.nextInt();
                        typeZero assignmentZero = new typeZero(checker, notes, totalMarks, assignmentId);
                        assignmentZeroArray[j] = assignmentZero;
                        j++;
                    } else if (assignmentType == 1) {
                        int noOfCorrectQuestions = scan.nextInt();
                        int noOfIncorrectQuestions = scan.nextInt();
                        typeOne assignmentOne = new typeOne(noOfCorrectQuestions, noOfIncorrectQuestions, assignmentId);
                        assignmentOneArray[k] = assignmentOne;
                        k++;
                    } else {
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
                batch.getStudentarray()[l].setSumZero();
                System.out.println(batch.getStudentarray()[check].getRollno() + " " + batch.getStudentarray()[check].getName());
                for (int i = 0; i < assignmentZeroArray.length; i++) {
                    if (assignmentZeroArray[i] != null) {
                        batch.getStudentarray()[l].setSum(assignmentZeroArray[i].getTotalMarks());
                        System.out.println(assignmentZeroArray[i].getAssignmentId() + " " + assignmentZeroArray[i].getTotalMarks());
                    }
                }
                System.out.println(batch.getStudentarray()[l].getSum());
                batch.getStudentarray()[l].setSumZero();
                for (int i = 0; i < assignmentOneArray.length; i++) {
                    if (assignmentOneArray[i] != null) {
                        batch.getStudentarray()[l].setSum(assignmentOneArray[i].getTotalMarks());
                        System.out.println(assignmentOneArray[i].getAssignmentId() + " " + assignmentOneArray[i].getTotalMarks());
                    }
                }
                System.out.println(batch.getStudentarray()[l].getSum());
                batch.getStudentarray()[l].setSumZero();
                for (int i = 0; i < assignmentTwoArray.length; i++) {
                    if (assignmentTwoArray[i] != null) {
                        batch.getStudentarray()[l].setSum(assignmentTwoArray[i].getMarksGiven());
                        System.out.println(assignmentTwoArray[i].getAssignmentId() + " " + assignmentTwoArray[i].getMarksGiven());
                    }
                }
                System.out.println(batch.getStudentarray()[l].getSum());
                check++;
            }

            testCases--;
        }
        scan.close();
    }
}
