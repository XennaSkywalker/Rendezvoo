package com.example.meetup_service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class MeetupController {
    private final MeetupService meetupService;

    public MeetupController(MeetupService meetupService) {
        this.meetupService = meetupService;
    }

    @PostMapping("backend/meetup")
    public MeetupResponseDTO createMeetup (@RequestBody MeetupRequestDTO meetupRequestDTO){
        return meetupService.createMeetup(meetupRequestDTO);
    }
}
