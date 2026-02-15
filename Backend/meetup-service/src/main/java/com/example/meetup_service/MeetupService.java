package com.example.meetup_service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MeetupService {
    List<MeetupEntity> entityList = new ArrayList<>();

    public MeetupEntity toEntity(MeetupRequestDTO meetupRequestDTO) {

        return new MeetupEntity(meetupRequestDTO.getLat(),
                meetupRequestDTO.getLng(),
                meetupRequestDTO.getMeetupName(),
                meetupRequestDTO.getMeetupDate(),
                meetupRequestDTO.getMeetupTime());
    }

    public MeetupRequestDTO toRequestDTO (MeetupEntity meetupEntity) {
        return new MeetupRequestDTO(meetupEntity.getLat(),
                meetupEntity.getLng(),
                meetupEntity.getMeetupName(),
                meetupEntity.getMeetupDate(),
                meetupEntity.getMeetupTime());
    }

    public void addEntity (MeetupEntity meetupEntity) {
        entityList.add(meetupEntity);
    }
}
