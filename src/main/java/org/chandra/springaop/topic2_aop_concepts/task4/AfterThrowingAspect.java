package org.chandra.springaop.topic2_aop_concepts.task4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAspect {
    @Pointcut("execution(* org.chandra.springaop.topic2_aop_concepts.task4.PaymentService.*(..))")
    public void afterThrowingPointcut(){}

    @AfterThrowing(pointcut = "afterThrowingPointcut()" , throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        System.out.println("[AOP] Exception in method " + joinPoint.getSignature().getName() + ": " + exception.getMessage());
    }
}
