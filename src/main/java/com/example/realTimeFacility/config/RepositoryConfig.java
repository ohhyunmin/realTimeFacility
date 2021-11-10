package com.example.realTimeFacility.config;

import com.example.realTimeFacility.constant.EventStatus;
import com.example.realTimeFacility.domain.Event;
import com.example.realTimeFacility.repository.EventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Configuration
public class RepositoryConfig {
    @Bean
    public EventRepository eventRepository(){
        return new EventRepository(){};
    }
}
