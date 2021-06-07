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
public class ContentValue {
    @JsonProperty("fwo")
    private String fwo;

    @JsonProperty("fwo_cust_status")
    private String fwo_cust_status;

    @JsonProperty("fwo_return_status")
    private String fwo_return_status;

    @JsonProperty("ordering_party")
    private String ordering_party;

    @JsonProperty("ordering_party_name")
    private String ordering_party_name;

    @JsonProperty("shipper_id")
    private String shipper_id;

    @JsonProperty("shipper_name")
    private String shipper_name;

    @JsonProperty("shipper_phone")
    private String shipper_phone;

    @JsonProperty("shipper_email")
    private String shipper_email;

    @JsonProperty("consignee_id")
    private String consignee_id;

    @JsonProperty("consignee_name")
    private String consignee_name;

    @JsonProperty("consignee_phone")
    private String consignee_phone;

    @JsonProperty("consignee_email")
    private String consignee_email;

    @JsonProperty("buyer_reference_number")
    private String buyer_reference_number;

    @JsonProperty("source_location_code")
    private String source_location_code;

    @JsonProperty("source_location_name")
    private String source_location_name;

    @JsonProperty("source_location_detail")
    private SourceLocationDetail source_location_detail;

    @JsonProperty("destination_location_code")
    private String destination_location_code;

    @JsonProperty("destination_location_name")
    private String destination_location_name;

    @JsonProperty("destination_location_detail")
    private DestinationLocationDetail destination_location_detail;

    @JsonProperty("freight_unit")
    private String freight_unit;

    @JsonProperty("fu_cust_status")
    private String fu_cust_status;

    @JsonProperty("package_id")
    private String package_id;

    @JsonProperty("item_description")
    private String item_description;

    @JsonProperty("gross_weight")
    private String gross_weight;

    @JsonProperty("charged_weight")
    private String charged_weight;

    @JsonProperty("weight_uom")
    private String weight_uom;

    @JsonProperty("length")
    private String length;

    @JsonProperty("width")
    private String width;

    @JsonProperty("height")
    private String height;

    @JsonProperty("destination_uom")
    private String destination_uom;

    @JsonProperty("service_type")
    private List<String> service_type;

    @JsonProperty("freight_charge")
    private String freight_charge;

    @JsonProperty("cod")
    private String cod;

    @JsonProperty("pickup_postman_id")
    private String pickup_postman_id;

    @JsonProperty("pickup_postman_name")
    private String pickup_postman_name;

    @JsonProperty("pickup_postman_phone")
    private String pickup_postman_phone;

    @JsonProperty("delivery_postman_id")
    private String delivery_postman_id;

    @JsonProperty("delivery_postman_name")
    private String delivery_postman_name;

    @JsonProperty("delivery_postman_phone")
    private String delivery_postman_phone;

    @JsonProperty("current_driver_id")
    private String current_driver_id;

    @JsonProperty("current_driver_name")
    private String current_driver_name;

    @JsonProperty("current_driver_phone")
    private String current_driver_phone;

    @JsonProperty("event")
    private List<Event> event;

    @JsonProperty("zvtp_promotion_code")
    private String zvtp_promotion_code;

    @JsonProperty("zvtp_campaign_code")
    private String zvtp_campaign_code;

    @JsonProperty("tel_number_src")
    private String tel_number_src;

    @JsonProperty("tel_number_dest")
    private String tel_number_dest;


}
