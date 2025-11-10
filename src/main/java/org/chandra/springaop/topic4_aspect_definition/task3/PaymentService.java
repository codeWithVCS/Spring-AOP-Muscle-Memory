package org.chandra.springaop.topic4_aspect_definition.task3;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processCreditCardPayment(String cardNumber){
        System.out.println("Processing Credit Card Payment for: " + cardNumber);
    }
    public void processUPIPayment(String upiId){
        System.out.println("Processing UPI Payment for: " + upiId);
    }
}
