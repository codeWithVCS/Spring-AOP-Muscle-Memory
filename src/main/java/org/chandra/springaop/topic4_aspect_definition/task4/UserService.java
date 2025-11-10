package org.chandra.springaop.topic4_aspect_definition.task4;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void createUser(String name, String email){
        System.out.println("Creating user: " + name + ", Email: " + email);
    }
    public void deleteUser(String name){
        System.out.println("Deleting user: " + name);
    }
}
