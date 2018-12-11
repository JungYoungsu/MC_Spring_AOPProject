package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;

import com.multicampus.biz.user.UserVO;

public class AfterReturningAdvice {

	public void afterLog(JoinPoint jp, Object returnObj) { 
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��] " + method + 
			"() �޼ҵ� �����");
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println("###" + user.getName() + " �����ڴ� ȯ���ؿ�.###");
			}
		}
	}
}
