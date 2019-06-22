package com.javalec.lec26;

public class MainClass {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;	//여기서 예외처리를 안 하면 예외가 발생하는 순간 시스템이 멈춰버리기 때문에 이 부분 밑에 있는 코드(Exception AFTER 출력)는 실행되지 않는다.
						//그래서 예외처리를 해서 나머지 코드가 실행될 수 있게 해준다.
		} catch (Exception e) { 
			e.printStackTrace();			//어떠한 예외가 발생했는지 출력해준다.
			String msg = e.getMessage();	//예외를 간단하게 보여준다.
			System.out.println("msg : " + msg);
		} finally {
			System.out.println("예외 발생 여부에 상관없이 언제나 실행 됩니다.");
		}
		
		System.out.println("Exception AFTER");
	}

}
