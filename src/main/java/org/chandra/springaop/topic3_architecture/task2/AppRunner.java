package org.chandra.springaop.topic3_architecture.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private MessageService messageService;
    @Override
    public void run(String... args) throws Exception {
        messageService.sendMessage("Spring AOP Proxy Decision Test");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
