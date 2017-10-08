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
            Person[] personarray = new Person[sizeOfArray];
            int[] singleArray = new int[sizeOfArray];
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
                    personarray[i] = eventPromo;
                }
                if (type.equals("breaker"))
                {
                    int expertise = scan.nextInt();
                    int horoscope = scan.nextInt();
                    Breakers breakers = new Breakers(name, seatingPrinciple, expertise, horoscope, type);
                    breakerArray[i] = breakers;
                    personarray[i] = breakers;
                }
                if (type.equals("brand"))
                {
                    String brandName = scan.next();
                    String officeName = scan.next();
                    BrandPromotions brandPromo = new BrandPromotions(name, seatingPrinciple, brandName, officeName, type);
                    brandPromoArray[i] = brandPromo;
                    personarray[i] = brandPromo;
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
                    personarray[i] = vip;
                }
                if (type.equals("commoner"))
                {
                    Commoners commoners = new Commoners(name, seatingPrinciple, type);
                    personarray[i] = commoners;
                }
            }

            int r = scan.nextInt();
            Receptionist[] receptionist = new Receptionist[r];
            for (int i = 0; i < r; i++)
            {
                String typeReceptionist = scan.next();
                String nameReceptionist = scan.next();
                if (typeReceptionist.equals("first"))
                {
                    Fcfsrecpetionist fcfsrecpetionist = new Fcfsrecpetionist(typeReceptionist, nameReceptionist);
                    receptionist[i] = fcfsrecpetionist;
                }
                if (typeReceptionist.equals("methodological"))
                {
                    Methodological methodological = new Methodological(typeReceptionist, nameReceptionist);
                    receptionist[i] = methodological;
                }
                if (typeReceptionist.equals("OnePerType"))
                {
                    Onepertype onepertype = new Onepertype(typeReceptionist, nameReceptionist);
                    receptionist[i] = onepertype;
                }
                if (typeReceptionist.equals("VIP"))
                {
                    Vipreceptionist vipreceptionist = new Vipreceptionist(typeReceptionist, nameReceptionist);
                    receptionist[i] = vipreceptionist;
                }
                if (typeReceptionist.equals("breaker"))
                {
                    Breakerreceptionist breakerreceptionist = new Breakerreceptionist(typeReceptionist, nameReceptionist);
                    receptionist[i] = breakerreceptionist;
                }
            }
            int logs = scan.nextInt();
            int counter = 0;
            for (int i = 0; i < personarray.length; i++)
            {
                if (personarray[i] != null)
                {
                    counter = counter + 1;
                }
            }
            insert.insertFirst(receptionist, integerArray, singleArray, person, personarray, m, n, counter);
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
