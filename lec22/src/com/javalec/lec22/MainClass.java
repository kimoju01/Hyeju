package com.javalec.lec22;

public class MainClass {
	
	public static void main(String[] args) {
		
		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();	//ClassEx�� ����� �޾ұ� ������ fun1(), fun2() �� �� ȣ���� �� �ִ�.
		ex.fun2();
	}

}
