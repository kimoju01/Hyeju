package com.javalec.ex;

public class proceEx {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1���� 10������ ���� ���� " + sum + "�Դϴ�");
		
		if(sum % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
	}

}
