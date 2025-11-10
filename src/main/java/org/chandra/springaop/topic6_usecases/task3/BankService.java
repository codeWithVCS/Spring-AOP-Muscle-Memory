package org.chandra.springaop.topic6_usecases.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankService {
    public void viewBalance(){
        System.out.println("Viewing Balance...");
    }
    public void withdrawMoney(){
        System.out.println("Withdrawing Money...");
    }
    public void closeAccount(){
        System.out.println("Closing Account...");
    }
}
