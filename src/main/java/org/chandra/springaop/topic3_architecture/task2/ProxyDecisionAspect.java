package org.chandra.springaop.topic3_architecture.task2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProxyDecisionAspect {
    @Pointcut("execution(* org.chandra.springaop.topic3_architecture.task2.MessageServiceImpl.*(..))")
    public void messageServicePointcut(){}
    @Before("messageServicePointcut()")
    public void beforeMessageService(JoinPoint joinPoint){
        System.out.println("[AOP] Proxy in use: " + joinPoint.getThis().getClass().getSimpleName());
    }
}
