package com.klub.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/logs")
public class AppApiController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    public AppApiController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @PostMapping
    public OutputMessage dispatchLogs(@RequestBody Message message){
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        this.simpMessagingTemplate.convertAndSend("/topic/messages",
                new OutputMessage(message.getFrom(), message.getText(), time));
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }
}

//https://github.com/eugenp/tutorials/blob/master/spring-websockets/src/main/java/com/baeldung/websockets/OutputMessage.java
//https://www.baeldung.com/websockets-spring

