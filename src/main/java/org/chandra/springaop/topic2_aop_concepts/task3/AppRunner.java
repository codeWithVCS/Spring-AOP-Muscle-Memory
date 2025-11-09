package org.chandra.springaop.topic2_aop_concepts.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private CalculationService calculationService;
    @Override
    public void run(String... args) throws Exception {
        calculationService.add(10, 20);
        calculationService.divide(20, 4);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
