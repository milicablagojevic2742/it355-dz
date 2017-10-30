/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.aop;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Blagojevic Milica
 */
@Aspect
public class InterceptorLog implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + arg0.getName());
        System.out.println("******");
    }

    @After("execution(* com.metropolitan.it355.aop.DeoDodajImpl.addDeo(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() metoda je pozvana!");
        System.out.println("presretanje : "
                + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @AfterThrowing(pointcut = "execution(* com.metropolitan.it355.aop.DeoDodajImpl.addDeoThrowException())", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("logAfterThrowing() metoda je pozvana!");
        System.out.println("presretanje : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");
    }

    @AfterReturning(pointcut = "execution(* com.metropolitan.it355.aop.DeoDodajImpl.addDeoRet())", returning = "returnValue")
    public void runAfter(JoinPoint joinPoint, String returnValue) {
        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("inserted after : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + returnValue);
    }

    @Around("execution(* execution(* com.metropolitan.it355.aop.DeoDodajImpl.addDeoAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logAround() metoda je pozvana!");
        System.out.println("presretanje metode : " + joinPoint.getSignature().getName());
        System.out.println("presretanje : " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Around before metoda je pozvana!");
        joinPoint.proceed();
        System.out.println("Around metoda je pozvana!");
        System.out.println("******");
    }

}
