package com.company.ques;
/* Documentation to the code
Classes used:
1.  Name:
        Person (Parent class)
    Attributes:
        1. (private) name (String)
        2. (private) behaviour (String)
        3. (private) type (String)
    Description:
        This class consist of common properties exhibited by any of the movie viewer.

2.  Name:
        Breakers (inherited from Person)
    Attributes:
        1. (private) expertise (int)
        2. (private) horoscope (int)
    Description:
        Breakers are the type of person who don't have pass.They have properties horoscope level and expertise in breaking.This class defines the breaker person inheriting properties from Parent class.

3.  Name:
        Vip (inherited from Person)
    Attributes:
        1. (private) event (Event[])
    Description:
        Vip's are the type of person who are given complimentary passes.They have featured in events.
        This class consists of the list of events they have featured in and each event has complete date of event, event's name and venue.

4.  Name:
        Commoners (inherited from Person)
    Attributes:
        no attributes defined, used attributes from parent class.
    Description:
        Commoners are just normal type of people.
        They don't have any attributes so this class only consist of attributes defined in parent class.


5.  Name:
        EventPromotions (inherited from Person)
    Attributes:
        1. (private) attendee (Event)
    Description:
        These are the type of people who were given passes in different events.
        This class consists of the detail of the event from which they got the passes.

6.  Name:
        BrandPromotions (inherited from Person)
    Attributes:
        1. (private) brandName (String)
        2. (private) officeName (String)
    Description:
        These are the type of people who are given passes by different brands to act as a brand ambassador.
        This class consist of the name of the brand and the office name of the brand.

7.  Name:
        Date
    Attributes:
        1. (private) date (int)
        2. (private) month (int)
        3. (private) year (int)
    Description:
        Date class is defined to store date in dd-mm-yyyy format.
        It consist of date, month and year as attributes.
        By overriding toString method, date is returned in dd-mm-yyyy format.

8.  Name:
        Event
    Attributes:
        1. (private) date (Date)
        2. (private) eventName (String)
        3. (private) venue (String)
    Description:
        This class is defined to store the data of an event.
        It consists of Date class object, event's name and event's venue.

9.  Name:
        Main
    Description:
        Main class to implement all the classes, take input, do computation and produce output.
    Attributes:
        1. testcases (int) -> Number of tescases
        2. m (int) -> number of rows in seating area
        3. n (int) -> number of columns in seating area.
        4. a (int) -> number of entering audience in cinema.
        5. sizeOfArray (int) -> size of array to be created
        6. type (String) -> type of person entering such as breaker, VIP etc.
        7. seatingPrinciple (String) -> person preffered seating style such as backbencher, crowdLoving etc.
        8. name (String) -> name of the person.
        9. r (int) -> number of receptionists.
        10. typeReceptionist (String) -> type of receptionist.
        11. nameReceptionist (String) -> name of receptionist.
        12. logs (int) -> 1 or 0 to print logs or not respectively.

Functions called:
1.  Name:
        print()
    Description:
        This function is called to print the output.It's declaration is in parent Person class but it is overridden in child classes to print respective data.
 */
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
            Person[] person = new Person[sizeOfArray];
            for (int i = 0; i < a; i++)
            {
                person[i] = new Person();
                String type = scan.next();
                String seatingPrinciple = scan.next();
                String name = scan.next();
                if (type.equals("event"))
                {
                    Date dateObj = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    Event eventObj = new Event(dateObj, scan.next(), scan.next());
                    EventPromotions eventPromo = new EventPromotions(name, seatingPrinciple, eventObj, type);
                    person[i] = eventPromo;
                }
                if (type.equals("breaker"))
                {
                    Breakers breakers = new Breakers(name, seatingPrinciple, scan.nextInt(), scan.nextInt(), type);
                    person[i] = breakers;
                }
                if (type.equals("brand"))
                {
                    BrandPromotions brandPromo = new BrandPromotions(name, seatingPrinciple, scan.next(), scan.next(), type);
                    person[i] = brandPromo;
                }
                if (type.equals("VIP"))
                {
                    int noOfEvents = scan.nextInt();
                    Vip vip = new Vip(name, seatingPrinciple, noOfEvents, type);
                    for (int j = 0; j < noOfEvents; j++)
                    {
                        Date dateObj = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                        vip.getEvent()[j] = new Event(dateObj, scan.next(), scan.next());
                    }
                    person[i] = vip;
                }
                if (type.equals("commoner"))
                {
                    Commoners commoners = new Commoners(name, seatingPrinciple, type);
                    person[i] = commoners;
                }
            }
            int r = scan.nextInt();
            for (int i = 0; i < r; i++)
            {
                String typeReceptionist = scan.next();
                String nameReceptionist = scan.next();
            }
            int logs = scan.nextInt();
            Person[] person1 = new Person[sizeOfArray];
            for (int i = 0; i < person.length; i++) {
                person1[i] = new Person();
                person1[i] = person[person.length - i - 1];
            }
            for (int i = 0; i < person1.length; i++) {
                person1[i].print();
            }
        }
    }
}
