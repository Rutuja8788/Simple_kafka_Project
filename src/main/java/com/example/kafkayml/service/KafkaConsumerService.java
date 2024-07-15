package com.example.kafkayml.service;


import com.example.kafkayml.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "${spring.kafka.topics.pro_con_json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeJson(User user)
    {
        System.out.println("Received JSON message: " + user.toString());
    }

    @KafkaListener(topics = "${spring.kafka.topics.pro_con.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeSimple(String message)
    {
        System.out.println("Received simple message: " + message);
    }
}
