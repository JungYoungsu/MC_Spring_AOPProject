package com.multicampus.biz.common;

public class AfterReturningAdvice {

	public void afterLog(Object returnObj) { 
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����");
		
		System.out.println("���� �� : " + returnObj.toString());
	}
}
