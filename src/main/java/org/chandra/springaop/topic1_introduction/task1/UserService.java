package org.chandra.springaop.topic1_introduction.task1;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void createUser(String name){
        System.out.println("[LOG] Starting createUser()");
        System.out.println("Created User: " + name);
        System.out.println("[LOG] Finished createUser()");
    }
    public void deleteUser(String name){
        System.out.println("[LOG] Starting deleteUser()");
        System.out.println("Deleted User: " + name);
        System.out.println("[LOG] Finished deleteUser()");
    }
}
