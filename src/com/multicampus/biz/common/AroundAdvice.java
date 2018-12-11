package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect	// Aspect = PointCut + Advice
public class AroundAdvice {
	@Pointcut("execution(* com.multicampus.biz..*Impl.*(..))")
	public void allPointcut() {} // ȣ����� �ʴ� �޼ҵ�

	@Around("allPointcut()")
	public Object aroundLog(ProceedingJoinPoint jp) throws Throwable { 
		String method = jp.getSignature().getName(); // �޼ҵ� �̸�
		// String longstr = jp.getSignature().toLongString(); // ���ϰ� ��Ű�� Ŭ������ �޼ҵ� ��ü ����
		// String shortstr = jp.getSignature().toShortString(); // Ŭ������ �޼ҵ� ����
		Object obj = null;
		long start = System.currentTimeMillis();
		System.out.println("AROUND::");
		
		obj = jp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("AROUND::" + method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + 
		(end - start) + "(ms)��");
		return obj;
	}
}
