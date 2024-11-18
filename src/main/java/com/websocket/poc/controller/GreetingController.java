package com.websocket.poc.controller;

import com.websocket.poc.config.model.Greeting;
import com.websocket.poc.config.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
@Slf4j
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        // Thread.sleep(1000); // simulated delay
        log.info("Sending message");
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.name()) + "!");
    }
}