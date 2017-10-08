package com.company.ques;

public class Breakers extends Person {
    private int expertise;
    private int horoscope;

    public Breakers(String name, String behaviour, int expertise, int horoscope, String type)
    {
        super(name, behaviour, type);
        this.expertise = expertise;
        this.horoscope = horoscope;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }

    public void setHoroscope(int horoscope) {
        this.horoscope = horoscope;
    }

    public int getExpertise() {
        return expertise;
    }

    public int getHoroscope() {
        return horoscope;
    }

    @Override
    public void print()
    {
        System.out.println(super.getName() + " " + this.expertise + " " + this.horoscope);
    }

    @Override
    public int arrange(Person[] person)
    {
        System.out.println("in here");
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[person.length - i - 1] == null)
            {
                System.out.println(i + " " + (person.length - i - 1));
                index = person.length - i - 1;
                break;
            }
        }
        return index;
    }

}
