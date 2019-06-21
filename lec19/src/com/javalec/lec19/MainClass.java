package com.javalec.lec19;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass fch = new FirstChildClass();	//어차피 FirstChildClass가 ParentClass 상속받으니까
		//FirstChildClass fch = new FirstChildClass(); 이렇게 해도 문제 없음.
		ParentClass sch = new SecondChildClass();
		
		pArr[0] = fch;
		pArr[1] = sch;
		
		

	}

}
