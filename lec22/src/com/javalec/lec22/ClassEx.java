package com.javalec.lec22;

public class ClassEx extends AbstractClassEx {
	
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);	//���� Ŭ������ �����͸� ������. AbstractClassEx�� ��������.
						//�׷��� �����ϸ� AbstractClassEx constructor�� ��µȴ�.
	}
	
	@Override
	public void fun2() {	//�߻� �޼���� �ݵ�� ����� �ް� �ִ� Ŭ�������� �����Ѵ�
		System.out.println("--fun2() START--");
	}

}
