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
		System.out.println("[���� ó��] " + method + " �޼ҵ� args ����: " 
				+ bf.toString()
				+ " ����Ͻ� ���� ���� �� ����");
	}
}
