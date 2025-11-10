package org.chandra.springaop.topic2_aop_concepts.task4;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment(double amount){
        System.out.println("Processing payment of amount: " +  amount);
        if(amount <= 0){
            throw new RuntimeException("Invalid Payment Amount");
        }
        else{
            System.out.println("Payment successful");
        }
    }
}
