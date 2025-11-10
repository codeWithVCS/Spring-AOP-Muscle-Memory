package org.chandra.springaop.topic2_aop_concepts.task5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AroundAdviceAspect {
    @Pointcut("execution(* org.chandra.springaop.topic2_aop_concepts.task5.ReportService.*(..))")
    public void aroundPointcut(){}

    @Around("aroundPointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("[AOP] Method " + joinPoint.getSignature().getName() + " executed in " + (endTime - startTime) + "ms");
    }
}
