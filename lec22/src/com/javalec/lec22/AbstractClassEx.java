package com.javalec.lec22;

public abstract class AbstractClassEx {
	
	int num;	//멤버 변수
	String str;
	
	public AbstractClassEx() {	//생성자
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {	//메서드
		System.out.println("--fun1() START--");
	}
	
	public abstract void fun2();	//추상 메서드. 상속을 받고 있는 클래스인 ClassEx에서 구현한다.

}
