package com.example.apirequest.controller;

import com.example.apirequest.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @RequestMapping(value = "ZTMI203AA", method = RequestMethod.GET)
    public ResponseEntity<Records> hanhtrinhdon(){
        SourceLocationDetail sourceLocationDetail =
                SourceLocationDetail.builder()
                .house_no("")
                .street_id("Số Nhà 582, Đường Lê Lợi")
                .ward_id("26120")
                .district_id("")
                .province_id("BGG")
                .country_id("VN").build();
        DestinationLocationDetail destinationLocationDetail =
                DestinationLocationDetail.builder()
                .house_no("")
                .street_id("Số Nhà 582, Đường Lê Lợi")
                .ward_id("26120")
                .district_id("")
                .province_id("BGG")
                .country_id("VN").build();
        List<String> service_type = new ArrayList<>();
        service_type.add("VTK");
        service_type.add("COD");
        List<Event> events = new ArrayList<>();
        Event event =
                Event.builder()
                .event_id("0000000010")
                .event_code("POPU")
                .event_description("Proof of Pickup")
                .event_reason_free("")
                .event_reason_code("")
                .event_reason_des("")
                .ext_loc_id("DKE")
                .ext_loc_des("")
                .date("20210401040359").build();
        events.add(event);
        ContentValue contentValue =
                ContentValue.builder()
                .fwo("")
                .fwo_cust_status("")
                .fwo_return_status("")
                .ordering_party("")
                .ordering_party_name("")
                .shipper_id("")
                .shipper_name("")
                .shipper_phone("")
                .shipper_email("")
                .consignee_name("")
                .consignee_phone("")
                .consignee_email("")
                .buyer_reference_number("")
                .source_location_code("")
                .source_location_name("")
                .source_location_detail(sourceLocationDetail)
                .destination_location_code("")
                .destination_location_name("")
                .destination_location_detail(destinationLocationDetail)
                .freight_unit("")
                .fu_cust_status("")
                .package_id("")
                .item_description("")
                .gross_weight("")
                .charged_weight("")
                .weight_uom("")
                .length("")
                .width("")
                .height("")
                .destination_uom("")
                .service_type(service_type)
                .freight_charge("")
                .cod("")
                .pickup_postman_id("")
                .pickup_postman_name("")
                .pickup_postman_phone("")
                .current_driver_id("")
                .current_driver_name("")
                .current_driver_phone("")
                .event(events)
                .zvtp_promotion_code("")
                .zvtp_campaign_code("")
                .tel_number_src("")
                .tel_number_dest("").build();

        Value value = Value.builder().value(contentValue).build();
        Records records = Records.builder().records(value).build();
        return ResponseEntity.status(HttpStatus.OK).body(records);
    }
}
