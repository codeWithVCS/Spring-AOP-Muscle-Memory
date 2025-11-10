package org.chandra.springaop.topic5_pointcuts.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private AccountService accountService;
    @Override
    public void run(String... args) throws Exception {
        accountService.openAccount("Bob");
        accountService.closeAccount("Bob");
        accountService.updateAccountDetails("Bob");
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
