package com.javalec.manager;

import java.util.ArrayList;

/* �л���� �ý��� Ŭ���� */
public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {		//�����Լ����� ����
		StudentManager studentManager = new StudentManager();
		
	    studentManager.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ");
		studentManager.addStudent("ȫ���", 24, 20106847, "����");
	    studentManager.addStudent("������", 21, 20149485, "����");
	    studentManager.addStudent("��ö��", 23, 20152342, "ü��");
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " �л� ���� �Է� ���� !! ");
	}

}
