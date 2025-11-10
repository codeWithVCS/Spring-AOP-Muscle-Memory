package org.chandra.springaop.topic2_aop_concepts.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private PaymentService paymentService;
    @Override
    public void run(String... args) throws Exception {
        try{
            paymentService.processPayment(5000);
        }
        catch (RuntimeException e){
            System.out.println("Exception caught in runner: " + e.getMessage());
        }

        try{
            paymentService.processPayment(0);
        }
        catch (RuntimeException e){
            System.out.println("Exception caught in runner: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
