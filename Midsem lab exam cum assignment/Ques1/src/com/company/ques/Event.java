package com.company.ques;

public class Event {
    private Date date;
    private String eventName;
    private String venue;

    public Event(){}
    public Event(Date date, String eventName, String venue)
    {
        this.date = date;
        this.eventName = eventName;
        this.venue = venue;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getVenue() {
        return venue;
    }
}
