package com.michalach_app.site.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "initial-topic", groupId = "kafka-datadog-example-microservice-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
