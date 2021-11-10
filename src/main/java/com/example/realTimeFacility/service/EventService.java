package com.example.realTimeFacility.service;

import com.example.realTimeFacility.constant.EventStatus;
import com.example.realTimeFacility.domain.Event;
import com.example.realTimeFacility.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;

    public List<Event> findEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDateTime,
            LocalDateTime eventEndDateTime){
        return eventRepository.findEvents(placeId, eventName, eventStatus, eventStartDateTime, eventEndDateTime);
    }

    public Event findEvent(Long eventId){
        return eventRepository.findEvent(eventId);
    }

    public boolean createEvent(Event event){
        return eventRepository.insertEvent(event);
    }

    public boolean modifyEvent(Long eventId, Event event){
        return eventRepository.updateEvent(eventId, event);
    }

    public boolean removeEvent(Long eventId){
        return eventRepository.deleteEvent(eventId);
    }
}
