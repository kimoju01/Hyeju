package com.javalec.makeClass;

public class MainClass {
	public static void main(String[] args) {
		
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));
		
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15, 1.6, 50, "010-1234-5678");
		
		mc.getAge();
		mc.setAge(16);
		
		double d = mc1.calculateBMI();
		System.out.println(d);
	}

}
