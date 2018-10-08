package com.javalec.ex;

public class proceEx {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 정수 합은 " + sum + "입니다");
		
		if(sum % 2 == 0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
	}

}
