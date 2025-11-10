package org.chandra.springaop.topic6_usecases.task3;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
    private String currentRole;
    public UserContext() {
        this.currentRole = "GUEST";
    }
    public void setRole(String role) {
        this.currentRole = role;
    }
    public String getRole(){
        return this.currentRole;
    }
}
