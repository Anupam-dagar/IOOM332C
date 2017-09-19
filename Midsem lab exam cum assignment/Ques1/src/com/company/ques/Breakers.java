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
        System.out.println(super.getName() + " " + expertise + " " + horoscope);
    }

}
