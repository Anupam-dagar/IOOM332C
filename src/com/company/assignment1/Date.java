package com.company.assignment1;

// Date class which conntains information for deadline date
public class Date {
    // variable declaration
    private int day;
    private int month;
    private int year;

    //Date class constructor
    public Date(int dayArg, int monthArg, int yearArg) {
        day = dayArg;
        month = monthArg;
        year = yearArg;
    }

    //setDay function to set day of deadline
    public void setDay(int dayArg) {
        day = dayArg;
    }

    //setMonth function to set month of deadline
    public void setMonth(int monthArg) {
        month = monthArg;
    }

    //setYear function to set year of deadline
    public void setYear(int yearArg) {
        year = yearArg;
    }

    //getDay function to get day of deadline
    public int getDay() {
        return day;
    }

    //getMonth function to get month of deadline
    public int getMonth() {
        return month;
    }

    //getYear function to get year of deadline
    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return (this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }
}
