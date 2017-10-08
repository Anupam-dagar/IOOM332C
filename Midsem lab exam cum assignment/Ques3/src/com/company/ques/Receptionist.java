package com.company.ques;

abstract class Receptionist {
    private String typeReceptionist;
    private String nameReceptionist;

    public Receptionist(String typeReceptionist, String nameReceptionist)
    {
        this.typeReceptionist = typeReceptionist;
        this.nameReceptionist = nameReceptionist;
    }

    public void setTypeReceptionist(String typeReceptionist) {
        this.typeReceptionist = typeReceptionist;
    }

    public void setNameReceptionist(String nameReceptionist) {
        this.nameReceptionist = nameReceptionist;
    }

    public String getTypeReceptionist() {
        return typeReceptionist;
    }

    public String getNameReceptionist() {
        return nameReceptionist;
    }

    public void incrementCounter(int counter){}

    public int getCounter()
    {
        return -1;
    }

    public void setCounter(int counterArg)
    {}

    public void insertPerson(Insert insert, Person[][] person, int[][] flagArray, int rows, int columns)
    {

    }
}
