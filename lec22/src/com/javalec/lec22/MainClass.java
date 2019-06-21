package com.javalec.lec22;

public class MainClass {
	
	public static void main(String[] args) {
		
		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();	//ClassEx가 상속을 받았기 때문에 fun1(), fun2() 둘 다 호출할 수 있다.
		ex.fun2();
	}

}
