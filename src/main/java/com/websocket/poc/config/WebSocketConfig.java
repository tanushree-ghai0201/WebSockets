package com.websocket.poc.config;

import com.websocket.poc.handler.TutorialHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(tutorialHandler(), "/tutorial")
                .setAllowedOrigins("*");
    }
    @Bean
    WebSocketHandler tutorialHandler() {
        return new TutorialHandler();
    }
}
