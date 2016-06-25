package com.spring.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(void *())")
    void beforeAdvice() {
        System.out.println("-------Before Execution-----");
    }

    @After("execution(void *())")
    void afterAdvice() {
        System.out.println("-------After Execution-----");
    }

    @AfterThrowing(pointcut = "execution(void *())", throwing = "ex")
    void afterThrowingAdvice(Exception ex) {
        System.out.println("-------After Throwing-----");
    }

    @Around("execution(Integer *())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-------Around Before Execution-----");
        proceedingJoinPoint.proceed();
        System.out.println("-------Around After Execution-----");
    }

    @AfterReturning(pointcut = "execution(Integer *())", returning = "retVal")
    void afterReturningAdvice(Integer retVal) {
        System.out.println("-------After Returning Advice Execution-----" + retVal);
    }
}
