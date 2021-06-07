package com.example.apirequest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DestinationLocationDetail {
    @JsonProperty("house_no")
    private String house_no;

    @JsonProperty("street_id")
    private String street_id;

    @JsonProperty("ward_id")
    private String ward_id;

    @JsonProperty("district_id")
    private String district_id;

    @JsonProperty("province_id")
    private String province_id;

    @JsonProperty("country_id")
    private String country_id;
}
