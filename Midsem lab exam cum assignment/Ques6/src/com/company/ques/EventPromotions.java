package com.company.ques;

public class EventPromotions extends Person {
    private Event attendee;

    public EventPromotions(String name, String behaviour, Event attendee, String type)
    {
        super(name, behaviour, type);
        this.attendee = attendee;
    }

    public void setAttendee() {
        this.attendee = new Event();
    }

    public Event getAttendee() {
        return attendee;
    }

    @Override
    public void print()
    {
        System.out.println(super.getName() + " " + this.attendee.getDate() + " " + this.attendee.getEventName() + " " + this.attendee.getVenue());
    }
}
