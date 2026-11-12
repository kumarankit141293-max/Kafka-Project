package com.example.kafka.Controller;

import com.example.kafka.DTO.SalesEvent;
import com.example.kafka.Producer.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping"/sales")
public class SalesControler {
    private final KafkaProdcerService producer;
    public SalesController(KafkaProducerService producer) {
        this.producer = producer;
    }
    @PostMapping
    public String pubish(@RequestBody SalesEvent event) {
        producer.publishEvent(event);
        return"Message Sent";
    }
}

