package com.javalec.lec21;

public class MainClass {
	
	public static void main(String[] args) {
		interfaceA ia = new interfaceClass();
		interfaceB ib = new interfaceClass();
		
		ia.funA();	//데이터타입이 interfaceA라서 funA()만 접근 가능하다 
		ib.funB();
	}
}
