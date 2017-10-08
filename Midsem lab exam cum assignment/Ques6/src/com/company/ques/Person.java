package com.company.ques;

public class Person {
    private String name;
    private String behaviour;
    private String type;
    private String receptionistName;
    private int position;

    public Person(){}

    public Person(String name, String behaviour, String type)
    {
        this.name = name;
        this.behaviour = behaviour;
        this.type = type;
        receptionistName = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public String getType() {
        return type;
    }

    public void print()
    {

    }

    public int arrange(Person[] person)
    {
        return 0;
    }

    public void setReceptionistName(String receptionistName)
    {
        this.receptionistName = receptionistName;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
