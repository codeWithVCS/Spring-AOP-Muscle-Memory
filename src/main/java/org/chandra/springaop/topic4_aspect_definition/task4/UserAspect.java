package org.chandra.springaop.topic4_aspect_definition.task4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {
    @Pointcut("execution(* org.chandra.springaop.topic4_aspect_definition.task4.UserService.*(..))")
    public void userServicePointcut(){}
    @Before("userServicePointcut()")
    public void beforeUserService(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        System.out.println("[AOP] Executing method: " + methodName + " in class " + className);
        if (arguments == null || arguments.length == 0) {
            System.out.println("[AOP] No arguments passed to method.");
        }
        else {
            System.out.print("[AOP] Argument: ");
            for(Object arg:arguments){
                System.out.print(arg +", ");
            }
            System.out.println();
        }
    }
}
