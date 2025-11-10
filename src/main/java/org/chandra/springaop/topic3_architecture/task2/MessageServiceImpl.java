package org.chandra.springaop.topic3_architecture.task2;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
