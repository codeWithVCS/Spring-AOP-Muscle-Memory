package org.chandra.springaop.topic6_usecases.task3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Autowired
    private UserContext userContext;

    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task3.BankService.viewBalance(..))")
    public void viewBalancePointcut(){}

    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task3.BankService.withdrawMoney(..))")
    public void withdrawMoneyPointcut(){}

    @Pointcut("execution(* org.chandra.springaop.topic6_usecases.task3.BankService.closeAccount(..))")
    public void closeAccountPointcut(){}

    @Before("viewBalancePointcut()")
    public void beforeViewBalance(JoinPoint joinPoint) {
        System.out.println("[SECURITY] All roles allowed for " + joinPoint.getSignature().getName());
    }

    @Before("withdrawMoneyPointcut()")
    public void beforeWithdrawMoney(JoinPoint joinPoint) {
        String role = userContext.getRole();
        if (role.equals("USER") || role.equals("ADMIN")) {
            // allowed
        } else {
            System.out.println("[SECURITY] Access denied for role: " + role +
                    " on method: " + joinPoint.getSignature().getName());
            throw new SecurityException("Unauthorized access");
        }
    }

    @Before("closeAccountPointcut()")
    public void beforeCloseAccount(JoinPoint joinPoint) {
        String role = userContext.getRole();
        if (role.equals("ADMIN")) {
            // allowed
        } else {
            System.out.println("[SECURITY] Access denied for role: " + role +
                    " on method: " + joinPoint.getSignature().getName());
            throw new SecurityException("Unauthorized access");
        }
    }
}
