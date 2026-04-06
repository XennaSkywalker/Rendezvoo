package com.example.meetup_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeetupRepository extends JpaRepository<MeetupEntity, Long> {
    List<MeetupEntity> findByMeetupStatus(MeetupStatus meetupStatus);
}
