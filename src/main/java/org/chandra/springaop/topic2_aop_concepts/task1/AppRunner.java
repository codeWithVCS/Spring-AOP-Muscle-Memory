package org.chandra.springaop.topic2_aop_concepts.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private OperationService operationService;
    @Override
    public void run(String... args) throws Exception {
        operationService.performOperation("Sample Task");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
