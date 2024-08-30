package com.example.calendar3;

public class Event {
    private long date;
    private String title;
    private String description;

    public Event(long date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public long getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
