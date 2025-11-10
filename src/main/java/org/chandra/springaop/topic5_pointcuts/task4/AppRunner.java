package org.chandra.springaop.topic5_pointcuts.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;
    @Override
    public void run(String... args) throws Exception {
        customerService.registerCustomer("John");
        customerService.updateCustomer("John");
        customerService.deleteCustomer("John");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
