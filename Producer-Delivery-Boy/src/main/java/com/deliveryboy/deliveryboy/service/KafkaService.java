package com.deliveryboy.deliveryboy.service;


import com.deliveryboy.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String ,String> kafkatemplate;
    public boolean updateLocation(String location)
    {
        kafkatemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        return true;

    }
}
