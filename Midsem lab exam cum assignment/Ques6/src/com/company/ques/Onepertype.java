package com.company.ques;

public class Onepertype extends Receptionist {
    private int counter;
    public Onepertype(String typeReceptionist, String nameReceptionist)
    {
        super(typeReceptionist, nameReceptionist);
        counter = 0;
    }

    @Override
    public void setCounter(int counterArg) {
        counter = counterArg;
    }

    @Override
    public int getCounter()
    {
        return this.counter;
    }

    @Override
    public void incrementCounter(int counterArg)
    {
        counter = counterArg + 1;
    }
}
