package com.company.assignment1;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int dayArg, int monthArg, int yearArg) {
        day = dayArg;
        month = monthArg;
        year = yearArg;
    }

    public void setDay(int dayArg) {
        day = dayArg;
    }

    public void setMonth(int monthArg) {
        month = monthArg;
    }

    public void setYear(int yearArg) {
        year = yearArg;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
