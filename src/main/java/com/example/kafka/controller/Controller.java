package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.service.SimpleProducerService;

@RestController
public class Controller {
    @Autowired
    private SimpleProducerService simpleProducerService;

    @PostMapping(value = "/message")
    public void postMessage(@RequestBody String message) {
        simpleProducerService.postMessage(message);
    }

}
