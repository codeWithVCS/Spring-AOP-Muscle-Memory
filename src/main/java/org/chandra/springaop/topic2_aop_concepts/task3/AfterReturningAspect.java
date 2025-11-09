package org.chandra.springaop.topic2_aop_concepts.task3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAspect {
    @AfterReturning(value = "execution(* org.chandra.springaop.topic2_aop_concepts.task3.CalculationService.*(..))", returning = "result")
    public void afterAdvice(JoinPoint joinPoint,Object result){
        System.out.println("[AOP] Method " +  joinPoint.getSignature().getName() + " executed successfully, returned: " + result);
    }
}
