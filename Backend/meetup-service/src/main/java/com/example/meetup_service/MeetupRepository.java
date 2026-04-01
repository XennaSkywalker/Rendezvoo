package com.example.meetup_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetupRepository extends JpaRepository<MeetupEntity, Long> {
}
