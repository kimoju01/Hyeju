package com.javalec.lec21;

public class MainClass {
	
	public static void main(String[] args) {
		interfaceA ia = new interfaceClass();
		interfaceB ib = new interfaceClass();
		
		ia.funA();	//������Ÿ���� interfaceA�� funA()�� ���� �����ϴ� 
		ib.funB();
	}
}
