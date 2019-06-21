package com.javalec.lec22;

public class ClassEx extends AbstractClassEx {
	
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);	//상위 클래스로 데이터를 보낸다. AbstractClassEx로 보내진다.
						//그래서 실행하면 AbstractClassEx constructor가 출력된다.
	}
	
	@Override
	public void fun2() {	//추상 메서드는 반드시 상속을 받고 있는 클래스에서 구현한다
		System.out.println("--fun2() START--");
	}

}
