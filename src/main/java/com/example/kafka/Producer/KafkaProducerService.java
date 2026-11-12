package com.example.kafka.Producer;

import com.example.kafka.DTO.SalesEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void publishEvent(SalesEvent event) {
        kafkaTemplate.send("sales-topic",event.getTransactionId(),event);
        System.out.println("Message Published : "+ event.getTransactionId());
    }
}
