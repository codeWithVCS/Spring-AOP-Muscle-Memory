package org.chandra.springaop.topic2_aop_concepts.task1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceAspect {
    @Pointcut("execution(* org.chandra.springaop.topic2_aop_concepts.task1.OperationService.performOperation(..))")
    public void beforePointcut(){}

    @Before("beforePointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[AOP] About to execute method:" + methodName);
    }
}
