package com.javalec.lec19;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass fch = new FirstChildClass();	//������ FirstChildClass�� ParentClass ��ӹ����ϱ�
		//FirstChildClass fch = new FirstChildClass(); �̷��� �ص� ���� ����.
		ParentClass sch = new SecondChildClass();
		
		pArr[0] = fch;
		pArr[1] = sch;
		
		

	}

}
