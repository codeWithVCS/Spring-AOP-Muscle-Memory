package org.chandra.springaop.topic4_aspect_definition.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        userService.createUser("Alice", "alice@example.com");
        userService.deleteUser("Alice");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
