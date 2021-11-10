package com.example.realTimeFacility.controller.api;

import com.example.realTimeFacility.constant.EventStatus;
import com.example.realTimeFacility.domain.Event;
import com.example.realTimeFacility.dto.APIDataResponse;
import com.example.realTimeFacility.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class APIEventController {

    private final EventService eventService;

    @GetMapping("/events")
    public APIDataResponse<List<Event>> getEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDateTime,
            LocalDateTime eventEndDateTime
    ){
        List<Event> response = eventService.findEvents(placeId, eventName, eventStatus, eventStartDateTime, eventEndDateTime)
                .stream().map(Event::new).collect(Collectors.toList());
        return APIDataResponse.of(response);
    }

    @PostMapping("/events")
    public Boolean create(){
        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId){
        return "event" + eventId;
    }

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId){
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId){
        return true;
    }
}
