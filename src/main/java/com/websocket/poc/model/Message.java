package com.websocket.poc.model;

import java.time.Instant;

public record Message(User user, String comment, Action action, Instant timestamp) {

}