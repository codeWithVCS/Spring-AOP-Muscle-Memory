package org.chandra.springaop.topic5_pointcuts.task4;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    public void registerCustomer(String name){
        System.out.println("Registering new customer: " + name);
    }
    public void updateCustomer(String name){
        System.out.println("Updating customer record: " + name);
    }
    public void deleteCustomer(String name){
        System.out.println("Deleting customer record: " + name);
    }
}
