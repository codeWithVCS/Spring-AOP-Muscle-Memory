package org.chandra.springaop.topic1_introduction.task1;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void placeOrder(String orderId){
        System.out.println("[LOG] Started placeOrder()");
        System.out.println("Placing Order: " + orderId);
        System.out.println("[LOG] Finished placeOrder()");
    }
    public void cancelOrder(String orderId){
        System.out.println("[LOG] Started cancelOrder()");
        System.out.println("Canceling Order: " + orderId);
        System.out.println("[LOG] Finished cancelOrder()");
    }
}
