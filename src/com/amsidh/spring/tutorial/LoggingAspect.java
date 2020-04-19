package com.amsidh.spring.tutorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		Object obj = null;
		try {
			System.out.println("Before method.");
			obj = proceedingJoinPoint.proceed();
			System.out.println("After method");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;

	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
}
