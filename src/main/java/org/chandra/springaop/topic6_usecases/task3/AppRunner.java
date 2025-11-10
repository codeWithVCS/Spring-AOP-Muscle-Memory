package org.chandra.springaop.topic6_usecases.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {
    @Autowired
    private UserContext userContext;
    @Autowired
    private BankService bankService;
    @Override
    public void run(String... args) throws Exception {
        userContext.setRole("GUEST");
        bankService.viewBalance();
        bankService.withdrawMoney();
        bankService.closeAccount();

        userContext.setRole("USER");
        bankService.viewBalance();
        bankService.withdrawMoney();
        bankService.closeAccount();

        userContext.setRole("ADMIN");
        bankService.viewBalance();
        bankService.withdrawMoney();
        bankService.closeAccount();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
