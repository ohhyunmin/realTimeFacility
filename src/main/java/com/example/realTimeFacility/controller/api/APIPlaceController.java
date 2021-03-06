package com.example.realTimeFacility.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIPlaceController {
    @GetMapping("/places")
    public List<String> getPlaces(){
        return null;
    }

    @PostMapping("/places")
    public Boolean createPlace(){
        return true;
    }

    @GetMapping("/places/{placeId}")
    public String getPlace(@PathVariable Integer placeId){
        return "place" + placeId;
    }

    @PutMapping("/places/{placeId")
    public Boolean modifyPlace(@PathVariable Integer placeId){
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(@PathVariable Integer placeId){
        return true;
    }
}
