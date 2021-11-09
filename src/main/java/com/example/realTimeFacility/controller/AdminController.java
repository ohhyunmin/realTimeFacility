package com.example.realTimeFacility.controller;

import com.example.realTimeFacility.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public String adminPlaces(@RequestParam PlaceType placeType,
                              @RequestParam String placeName, @RequestParam String address){
        //PlaceType 은 enum 이지만 내부적으로 name 값을 가져온다.
        //@RequestParam 은 생략할 수 있다. @RequestParam(required=true) : 해당 파라미터가 필수로 필요할 때는 이렇게 지정해준다.


        return "admin/places";
    }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId){
        return "admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents(){
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId){
        return "admin/eventDetail";
    }
}
