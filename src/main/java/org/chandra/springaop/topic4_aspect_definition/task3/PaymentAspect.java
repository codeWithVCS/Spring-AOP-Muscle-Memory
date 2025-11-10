package org.chandra.springaop.topic4_aspect_definition.task3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PaymentAspect {
    @Pointcut("execution(* org.chandra.springaop.topic4_aspect_definition.task3.PaymentService.processCreditCardPayment(..))")
    public void creditCardPaymentPointcut(){}
    @Pointcut("execution(* org.chandra.springaop.topic4_aspect_definition.task3.PaymentService.processUPIPayment(..))")
    public void upiPaymentPointcut(){}
    @Pointcut("creditCardPaymentPointcut() || upiPaymentPointcut()")
    public void allPaymentsPointcut(){}
    @Before("allPaymentsPointcut()")
    public void beforeAllPayments(JoinPoint joinPoint){
        System.out.println("[AOP] Initiating payment method: " + joinPoint.getSignature().getName());
    }
    @After("allPaymentsPointcut()")
    public void afterAllPayments(JoinPoint joinPoint){
        System.out.println("[AOP] Completed payment method: " + joinPoint.getSignature().getName());
    }
}
