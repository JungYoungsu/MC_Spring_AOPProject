package com.multicampus.biz.common;

import java.sql.SQLException;

public class AfterThrowingAdvice {

	public void exceptionLog(Exception exceptObj) { 
		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("0번 글을 등록할 수 있을까요?");
		} else if(exceptObj instanceof ArithmeticException) {
			System.out.println("0으로 숫자를 나눌 수 있을까요?");
		} else if(exceptObj instanceof SQLException) {
			System.out.println("SQL 구문에 문제가 있나봐요.");
		} else {
			System.out.println("원인 모를 예외 발생!!!");
		}
		
	}
}
