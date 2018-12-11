package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;

import com.multicampus.biz.user.UserVO;

public class AfterReturningAdvice {

	public void afterLog(JoinPoint jp, Object returnObj) { 
		String method = jp.getSignature().getName();
		
		System.out.println("[사후 처리] " + method + 
			"() 메소드 수행됨");
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println("###" + user.getName() + " 관리자님 환영해요.###");
			}
		}
	}
}
