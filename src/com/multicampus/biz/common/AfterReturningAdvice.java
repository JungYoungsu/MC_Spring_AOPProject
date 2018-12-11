package com.multicampus.biz.common;

public class AfterReturningAdvice {

	public void afterLog(Object returnObj) { 
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
		
		System.out.println("리턴 값 : " + returnObj.toString());
	}
}
