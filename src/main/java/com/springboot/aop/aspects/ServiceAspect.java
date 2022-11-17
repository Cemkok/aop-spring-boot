package com.springboot.aop.aspects;

import java.util.concurrent.SynchronousQueue;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
	
	@Before("execution(* com.springboot.aop.service.MessageService.getMessage(..))")
	public void beforeGetMessage(JoinPoint joinPoint){
		System.out.println("Mesaj ver metodundan önce paramtere yakalandı param : " +joinPoint.getArgs()[0]);
		System.out.println(joinPoint.getSignature()) ;
		
	}
	
	@After("execution(* com.springboot.aop.service.*.*(..))")
	public void afterGetMessage(JoinPoint joinPoint){
		System.out.println("Mesaj ver metodundan sonra parametre yakalandi param :" +joinPoint.getArgs());
		System.out.println(joinPoint.getSignature());
		 
		
	}
	
	

}
