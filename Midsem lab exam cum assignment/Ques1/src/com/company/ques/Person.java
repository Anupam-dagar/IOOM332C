package com.company.ques;

public class Person {
    private String name;
    private String behaviour;
    private String type;

    public Person(){}

    public Person(String name, String behaviour, String type)
    {
        this.name = name;
        this.behaviour = behaviour;
        this.type = type;
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
}
