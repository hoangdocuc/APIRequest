package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Event {
    @JsonProperty("event_id")
    private String event_id;

    @JsonProperty("event_code")
    private String event_code;

    @JsonProperty("event_description")
    private String event_description;

    @JsonProperty("event_reason_free")
    private String event_reason_free;

    @JsonProperty("event_reason_code")
    private String event_reason_code;

    @JsonProperty("event_reason_des")
    private String event_reason_des;

    @JsonProperty("ext_loc_id")
    private String ext_loc_id;

    @JsonProperty("ext_loc_des")
    private String ext_loc_des;

    @JsonProperty("date")
    private String date;
}
