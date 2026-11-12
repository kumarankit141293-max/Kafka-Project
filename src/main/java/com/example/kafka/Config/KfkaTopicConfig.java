package com.example.kafka.Config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframwork.context.annotation.Configuraton;
@Configuration
public class KafkaTopicConfig {
    @Bean
    pulic NewTopic topic() {
        return new NewTopic(sales-topic",3,(short) 1);
    }
}

