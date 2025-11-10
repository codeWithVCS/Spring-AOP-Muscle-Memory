package org.chandra.springaop.topic5_pointcuts.task2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WildcardAspect {
    @Pointcut("execution(* open*(..))")
    public void openWildcardPointcut(){}
    @Pointcut("execution(* *Account(..))")
    public void endsWithAccountPointcut(){}
    @Pointcut("execution(* *Account*(..))")
    public void executionWildcardMethodPointcut(){}
    @Pointcut("execution(* org.chandra.springaop.topic5_pointcuts.task2.*.*(..))")
    public void executionPointcut(){}
    @Before("openWildcardPointcut()")
    public void beforeOpenWildcardPointcut(){
        System.out.println("[AOP] Matched method starting with 'open'");
    }
    @Before("endsWithAccountPointcut()")
    public void beforeExecutionWildcardPointcut(){
        System.out.println("[AOP] Matched method ending with 'Account'");
    }
    @Before("executionWildcardMethodPointcut()")
    public void beforeExecutionWildcardMethodPointcut(){
        System.out.println("[AOP] Matched method containing 'Account'");
    }
    @Before("executionPointcut()")
    public void beforeExecutionPointcut(){
        System.out.println("[AOP] Matched method inside topic5_pointcuts.task2 package");
    }
}

