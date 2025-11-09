package org.chandra.springaop.topic2_aop_concepts.task1;

import org.springframework.stereotype.Component;

@Component
public class OperationService {
    public void performOperation(String operationName){
        System.out.println("Performing: " + operationName);
    }
}
