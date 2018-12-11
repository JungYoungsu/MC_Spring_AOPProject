package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

	public Object aroundLog(ProceedingJoinPoint jp) throws Throwable { 
		String method = jp.getSignature().getName(); // �޼ҵ� �̸�
		// String longstr = jp.getSignature().toLongString(); // ���ϰ� ��Ű�� Ŭ������ �޼ҵ� ��ü ����
		// String shortstr = jp.getSignature().toShortString(); // Ŭ������ �޼ҵ� ����
		Object obj = null;
		long start = System.currentTimeMillis();
		
		obj = jp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + 
		(end - start) + "(ms)��");
		return obj;
	}
}
