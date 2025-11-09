package org.chandra.springaop.topic2_aop_concepts.task3;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {
    public int add(int a, int b){
        System.out.println("Performing addition...");
        return a+b;
    }
    public int divide(int a, int b){
        System.out.println("Performing division...");
        return a/b;
    }
}
