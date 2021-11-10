package com.example.realTimeFacility.repository;

import com.example.realTimeFacility.constant.EventStatus;
import com.example.realTimeFacility.domain.Event;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    default List<Event> findEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDateTime,
            LocalDateTime eventEndDateTime){return null;}
    default Event findEvent(Long eventId){return null;}
    default boolean insertEvent(Event event){return false;}
    default boolean updateEvent(Long eventId, Event event){return false;}
    default boolean deleteEvent(Long eventId){return false;}
}
