package com.javalec.lec21;

public class interfaceClass implements interfaceA, interfaceB {

	public interfaceClass() {
		System.out.println("--interfaceClass constructor--");
	}
	
	@Override	//interfaceA�� �ִ� ���� interfaceClass���� �ٽ� �����Ѵ�
	public void funA() {	//���� �Ǿ��ְ� ���ǵ��� ���� �޼ҵ���� ���⼭ �����Ѵ�.
		System.out.println("--funA()--");
	}

	@Override
	public void funB() {
		System.out.println("--funB()--");	
	}
	
	

}
