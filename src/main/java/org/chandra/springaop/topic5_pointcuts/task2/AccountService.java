package org.chandra.springaop.topic5_pointcuts.task2;

import org.springframework.stereotype.Component;

@Component
public class AccountService {
    public void openAccount(String accountHolder){
        System.out.println("Opening account for: " +accountHolder);
    }
    public void closeAccount(String accountHolder){
        System.out.println("Closing account for: " +accountHolder);
    }
    public void updateAccountDetails(String accountHolder){
        System.out.println("Updating account details for: " +accountHolder);
    }
}
