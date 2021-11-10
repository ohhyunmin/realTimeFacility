package com.example.realTimeFacility.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class APIDataResponse<T> {

    private final T data;

    private APIDataResponse(T data){
        this.data = data;
    }

    public static <T> APIDataResponse<T> of(T data){
        return new APIDataResponse(data);
    }
}
