package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SimpleProducerService {
	
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void postMessage(final String message) {
        kafkaTemplate.send("input", null, message);
    }
}
