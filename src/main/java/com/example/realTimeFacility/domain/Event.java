package com.example.realTimeFacility.domain;

import com.example.realTimeFacility.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDateTime;
    private LocalDateTime eventEndDateTime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
