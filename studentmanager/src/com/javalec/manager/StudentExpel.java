package com.javalec.manager;

import java.util.ArrayList;

/* �������� �л��� �����ϱ� ���� Ŭ���� */
public class StudentExpel {
	
	ArrayList<Student> expelStudents;	//�迭�� ����� Ÿ���� Student �� ��. Student Ŭ������ ���Ե��� ����� �� �ִ� Ÿ�� �� ��.
	
	public StudentExpel() {
		expelStudents = new ArrayList<Student>();	//�ʱ�ȭ
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		expelStudents.add(new Student(name, age, studentNum, major));	//Student Ÿ���̱� ������ Student ��ü�� ������ �ȴ�..?
	}
	
}
