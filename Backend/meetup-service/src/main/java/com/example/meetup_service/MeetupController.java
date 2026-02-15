package com.example.meetup_service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class MeetupController {
    private final MeetupService meetupService;

    public MeetupController(MeetupService meetupService) {
        this.meetupService = meetupService;
    }

    @PostMapping("backend/meetup")
    public MeetupRequestDTO createMeetup (@RequestBody MeetupRequestDTO meetupRequestDTO){
        MeetupEntity newEntity = meetupService.toEntity(meetupRequestDTO);
        meetupService.addEntity(newEntity);
        return meetupService.toRequestDTO(newEntity);
    }
}
