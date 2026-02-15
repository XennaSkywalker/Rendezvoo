package com.example.meetup_service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class MeetupEntity {
    private double lat;
    private double lng;
    private String meetupName;
    private LocalDate meetupDate;
    private LocalTime meetupTime;

    public MeetupEntity() {
    }

    public MeetupEntity(double lat, double lng, String meetupName, LocalDate meetupDate, LocalTime meetupTime) {
        this.lat = lat;
        this.lng = lng;
        this.meetupName = meetupName;
        this.meetupDate = meetupDate;
        this.meetupTime = meetupTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetupEntity that = (MeetupEntity) o;
        return Double.compare(that.lat, lat) == 0 && Double.compare(that.lng, lng) == 0 && Objects.equals(meetupName, that.meetupName) && Objects.equals(meetupDate, that.meetupDate) && Objects.equals(meetupTime, that.meetupTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lng, meetupName, meetupDate, meetupTime);
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getMeetupName() {
        return meetupName;
    }

    public void setMeetupName(String meetupName) {
        this.meetupName = meetupName;
    }

    public LocalDate getMeetupDate() {
        return meetupDate;
    }

    public void setMeetupDate(LocalDate meetupDate) {
        this.meetupDate = meetupDate;
    }

    public LocalTime getMeetupTime() {
        return meetupTime;
    }

    public void setMeetupTime(LocalTime meetupTime) {
        this.meetupTime = meetupTime;
    }
}
