package com.multicampus.biz.common;

import java.sql.SQLException;

public class AfterThrowingAdvice {

	public void exceptionLog(Exception exceptObj) { 
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻�");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("0�� ���� ����� �� �������?");
		} else if(exceptObj instanceof ArithmeticException) {
			System.out.println("0���� ���ڸ� ���� �� �������?");
		} else if(exceptObj instanceof SQLException) {
			System.out.println("SQL ������ ������ �ֳ�����.");
		} else {
			System.out.println("���� �� ���� �߻�!!!");
		}
		
	}
}
