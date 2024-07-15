package com.example.kafkayml.controller;





import com.example.kafkayml.model.User;
import com.example.kafkayml.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController
{

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publishJson")
    public ResponseEntity<String> publishJson(@RequestBody User user)
    {
        producerService.sendJsonMessage(user);
        return ResponseEntity.ok("JSON message sent to Kafka topic");
    }

    @PostMapping("/publishSimple")
    public ResponseEntity<String> publishSimple(@RequestParam("message") String message)
    {
        producerService.sendSimpleMessage(message);
        return ResponseEntity.ok("Simple message sent to Kafka topic");
    }
}


