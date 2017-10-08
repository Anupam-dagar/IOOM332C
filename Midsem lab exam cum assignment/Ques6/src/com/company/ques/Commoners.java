package com.company.ques;

public class Commoners extends Person {
    public Commoners(String name, String behaviour, String type)
    {
        super(name, behaviour, type);
    }

    @Override
    public void print()
    {
        System.out.println(super.getName());
    }
}
