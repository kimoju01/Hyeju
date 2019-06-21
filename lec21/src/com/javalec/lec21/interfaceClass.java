package com.javalec.lec21;

public class interfaceClass implements interfaceA, interfaceB {

	public interfaceClass() {
		System.out.println("--interfaceClass constructor--");
	}
	
	@Override	//interfaceA에 있는 것을 interfaceClass에서 다시 구현한다
	public void funA() {	//선언만 되어있고 정의되지 않은 메소드들을 여기서 정의한다.
		System.out.println("--funA()--");
	}

	@Override
	public void funB() {
		System.out.println("--funB()--");	
	}
	
	

}
