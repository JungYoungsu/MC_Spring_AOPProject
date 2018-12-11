package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {

	public void printLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		StringBuffer bf = new StringBuffer();
		for (Object object : args) {			
			bf.append(object.toString());
			bf.append(" ");
		}
		System.out.println("[사전 처리] " + method + " 메소드 args 정보: " 
				+ bf.toString()
				+ " 비즈니스 로직 수행 전 동작");
	}
}
