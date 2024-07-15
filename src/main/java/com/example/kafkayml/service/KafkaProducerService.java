package com.example.kafkayml.service;





import com.example.kafkayml.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String JSON_TOPIC = "pro_con_json";
    private static final String SIMPLE_TOPIC = "pro_con";

    @Autowired
    private KafkaTemplate<String, User> jsonKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, String> simpleKafkaTemplate;

    public void sendJsonMessage(User user)
    {
        this.jsonKafkaTemplate.send(JSON_TOPIC, user);
    }

    public void sendSimpleMessage(String message) {
        this.simpleKafkaTemplate.send(SIMPLE_TOPIC, message);
    }
}
