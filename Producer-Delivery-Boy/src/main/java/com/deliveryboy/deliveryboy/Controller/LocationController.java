package com.deliveryboy.deliveryboy.Controller;


import com.deliveryboy.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService service;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(String location)
    {
        service.updateLocation("("+ Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")");
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
