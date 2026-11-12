package com.example.kafka.Consumer;

import com.example.kafka.DTO.SalesEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "sales-topic",groupId = "sales-group")
    public void consume(SalesEvent event) {
        System.out.println("Message Received : "+ event.getTransactionId());
        System.out.println("Amount : "+ event.getAmount());
    }
}
