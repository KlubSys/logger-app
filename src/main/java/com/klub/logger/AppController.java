package com.klub.logger;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AppController {

    @GetMapping("/ui")
    public String index(Model model) {
        model.addAttribute("name", "App");
        return "ui";
    }

}

//https://github.com/eugenp/tutorials/blob/master/spring-websockets/src/main/java/com/baeldung/websockets/OutputMessage.java
//https://www.baeldung.com/websockets-spring

