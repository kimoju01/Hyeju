package com.javalec.toy;

public class ToyAirplane implements Toy {
	
	//Toy 인터페이스에 메소드 선언만 되어있는 것을
	//ToyAirplane이라는 객체의 특성에 맞게 다시 재정의. 구현을 한 것이다. => 객체에 맞게 별도로 쓸 수 있어서 편하다
	
	@Override
	public void walk() {
		System.out.println("The airplane can not walk");
		
	}
	
	@Override
	public void run() {
		System.out.println("The airplane can not run");
		
	}
	
	@Override
	public void alarm() {
		System.out.println("The airplane has alarm function");
		
	}
	
	@Override
	public void light() {
		System.out.println("The airplane has no light function");
		
	}

}
