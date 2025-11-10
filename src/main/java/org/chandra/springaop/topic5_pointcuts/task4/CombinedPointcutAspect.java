package org.chandra.springaop.topic5_pointcuts.task4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CombinedPointcutAspect {
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task4.CustomerService.register*(..))")
    public void registerOperation(){}
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task4.CustomerService.update*(..))")
    public void updateOperation(){}
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task4.CustomerService.delete*(..))")
    public void deleteOperation(){}
    @Pointcut("registerOperation() || updateOperation()")
    public void modificationOperations(){}
    @Pointcut("!deleteOperation()")
    public void nonDeletionOperations(){}

    @Before("registerOperation()")
    public void beforeRegisterOperation(){
        System.out.println("[AOP] Register operation started");
    }
    @Before("modificationOperations()")
    public void beforeModifyOperation(){
        System.out.println("[AOP] Customer modification in progress");
    }
    @Before("nonDeletionOperations()")
    public void beforeNonDeletionOperations(){
        System.out.println("[AOP] Operation excluding deletions");
    }
    @Before("deleteOperation()")
    public void beforeDeleteOperation(){
        System.out.println("[AOP] Customer deletion completed");
    }
}
