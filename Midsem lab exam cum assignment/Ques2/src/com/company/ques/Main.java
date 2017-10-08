package com.company.ques;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        while (testcases-- > 0)
        {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int a = scan.nextInt();
            int sizeOfArray = m*n;
            Person[][] person = new Person[m][n];
            int[][] integerArray = new int[m][n];
            Insert insert = new Insert();
            Breakers[] breakerArray = new Breakers[sizeOfArray];
            BrandPromotions[] brandPromoArray = new BrandPromotions[sizeOfArray];
            for (int i = 0; i < a; i++)
            {
                String type = scan.next();
                String seatingPrinciple = scan.next();
                String name = scan.next();
                int index;
                if (type.equals("event"))
                {
                    int date = scan.nextInt();
                    int month = scan.nextInt();
                    int year = scan.nextInt();
                    Date dateObj = new Date(date, month, year);
                    String eventName = scan.next();
                    String eventVenue = scan.next();
                    Event eventObj = new Event(dateObj, eventName, eventVenue);
                    EventPromotions eventPromo = new EventPromotions(name, seatingPrinciple, eventObj, type);
                    insert.insertSL(integerArray, person, eventPromo, m , n);
                }
                if (type.equals("breaker"))
                {
                    int expertise = scan.nextInt();
                    int horoscope = scan.nextInt();
                    Breakers breakers = new Breakers(name, seatingPrinciple, expertise, horoscope, type);
                    breakerArray[i] = breakers;
                    insert.insertBreakers(integerArray, person, breakers, m, n);
                }
                if (type.equals("brand"))
                {
                    String brandName = scan.next();
                    String officeName = scan.next();
                    BrandPromotions brandPromo = new BrandPromotions(name, seatingPrinciple, brandName, officeName, type);
                    brandPromoArray[i] = brandPromo;
                    insert.insertEntrance(integerArray, person, brandPromo, m, n);
                }
                if (type.equals("VIP"))
                {
                    int noOfEvents = scan.nextInt();
                    Vip vip = new Vip(name, seatingPrinciple, noOfEvents, type);
                    for (int j = 0; j < noOfEvents; j++)
                    {
                        int date = scan.nextInt();
                        int month = scan.nextInt();
                        int year = scan.nextInt();
                        Date dateObj = new Date(date, month, year);
                        String eventName = scan.next();
                        String eventVenue = scan.next();
                        vip.getEvent()[j] = new Event(dateObj, eventName, eventVenue);
                    }
                    insert.insertCelebrity(integerArray, person, vip, m, n);
                }
                if (type.equals("commoner"))
                {
                    Commoners commoners = new Commoners(name, seatingPrinciple, type);
                    insert.insertCL(integerArray, person, commoners, m, n);
                }
            }

            int r = scan.nextInt();
            for (int i = 0; i < r; i++)
            {
                String typeReceptionist = scan.next();
                String nameReceptionist = scan.next();
            }
            int logs = scan.nextInt();
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (integerArray[i][j] == 1)
                    {
                        person[i][j].print();
                    }
                }
            }
        }
    }
}
