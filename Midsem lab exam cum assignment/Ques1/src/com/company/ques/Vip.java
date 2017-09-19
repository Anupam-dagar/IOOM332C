package com.company.ques;

public class Vip extends Person {
    private Event[] event;

    public Vip(String name, String behaviour, int arraySize, String type)
    {
        super(name, behaviour, type);
        this.event = new Event[arraySize];
    }

    public void setEvent(int arraySize) {
        this.event = new Event[arraySize];
    }

    public Event[] getEvent() {
        return event;
    }

    @Override
    public void print()
    {
        System.out.println(super.getName());
        for (int i = 0; i < this.event.length; i++) {
            System.out.println(this.event[i].getDate() + " " + this.event[i].getEventName() + " " + this.event[i].getVenue());
        }
    }
}
