package org.chandra.springaop.topic1_introduction.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Override
    public void run(String... args) throws Exception {
        userService.createUser("Alice");
        userService.deleteUser("Alice");
        orderService.placeOrder("ORD123");
        orderService.cancelOrder("ORD123");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
