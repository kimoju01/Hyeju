package com.javalec.lec19;

public class SecondChildClass extends ParentClass {
	
	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("--SecondChildClass's makeJJajang");
	}

}
