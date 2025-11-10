package org.chandra.springaop.topic4_aspect_definition.task3;

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
        paymentService.processCreditCardPayment("1234-5678-9999-0000");
        paymentService.processUPIPayment("john@upi");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
