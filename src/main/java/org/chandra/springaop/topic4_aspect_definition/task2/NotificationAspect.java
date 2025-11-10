package org.chandra.springaop.topic4_aspect_definition.task2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotificationAspect {
    @Pointcut("execution(* org.chandra.springaop.topic4_aspect_definition.task2.NotificationService.*(..))")
    public void notificationServicePointcut(){}
    @Before("notificationServicePointcut()")
    public void beforeNotificationService(JoinPoint joinPoint){
        System.out.println("[AOP] About to execute: " + joinPoint.getSignature().getName());
    }
    @After("notificationServicePointcut()")
    public void afterNotificationService(JoinPoint joinPoint){
        System.out.println("[AOP] Completed execution of: " +  joinPoint.getSignature().getName());
    }
}
