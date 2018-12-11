package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	@Pointcut("execution(* com.multicampus.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		StringBuffer bf = new StringBuffer();
		for (Object object : args) {			
			bf.append(object.toString());
			bf.append(" ");
		}
		System.out.println("[���� ó��] " + method + " �޼ҵ� args ����: " 
				+ bf.toString()
				+ " ����Ͻ� ���� ���� �� ����");
	}
}
