package org.chandra.springaop.topic4_aspect_definition.task2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendEmail(String recipient){
        System.out.println("Sending Email to: " + recipient);
    }
    public void sendSMS(String number){
        System.out.println("Sending SMS to: " + number);
    }
}

