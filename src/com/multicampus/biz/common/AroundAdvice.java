package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

	public Object aroundLog(ProceedingJoinPoint jp) throws Throwable { 
		String method = jp.getSignature().getName(); // 메소드 이름
		// String longstr = jp.getSignature().toLongString(); // 리턴값 패키지 클래스명 메소드 전체 정보
		// String shortstr = jp.getSignature().toShortString(); // 클래스명 메소드 정보
		Object obj = null;
		long start = System.currentTimeMillis();
		
		obj = jp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(method + "() 메소드 실행에 걸린 시간 : " + 
		(end - start) + "(ms)초");
		return obj;
	}
}
