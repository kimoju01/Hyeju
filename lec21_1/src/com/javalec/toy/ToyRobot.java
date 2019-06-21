package com.javalec.toy;

public class ToyRobot implements Toy {
	
	@Override
	public void walk() {
		System.out.println("The airplane can walk");
		
	}
	
	@Override
	public void run() {
		System.out.println("The airplane can run");
		
	}
	
	@Override
	public void alarm() {
		System.out.println("The airplane has no alarm function");
		
	}
	
	@Override
	public void light() {
		System.out.println("The airplane has light function");
		
	}


}
