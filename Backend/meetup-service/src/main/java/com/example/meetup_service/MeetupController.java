package com.example.meetup_service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class MeetupController {
    @PostMapping("backend/meetup")
    public String createMeetup (@RequestBody Meetup meetup){
        return meetup.toString();
    }
}
