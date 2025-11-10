package org.chandra.springaop.topic6_usecases.task1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task1.ProductService.*(..))")
    public void productServicePointcut(){}
    @Before("productServicePointcut()")
    public void beforeProductServicePointcut(JoinPoint joinPoint){
        System.out.println("[AUDIT] Invoking method: "+ joinPoint.getSignature().getName() + " at " + java.time.LocalDateTime.now());
        Object[] args = joinPoint.getArgs();
        System.out.println("[AUDIT] Arguments: "+ Arrays.toString(args));
    }
    @AfterReturning("productServicePointcut()")
    public void afterReturningProductServicePointcut(JoinPoint joinPoint){
        System.out.println("[AUDIT] Method "+ joinPoint.getSignature().getName()+" executed successfully");
    }
}
