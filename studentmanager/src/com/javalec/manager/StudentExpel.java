package com.javalec.manager;

import java.util.ArrayList;

/* 재적당한 학생을 관리하기 위한 클래스 */
public class StudentExpel {
	
	ArrayList<Student> expelStudents;	//배열에 저장된 타입이 Student 인 것. Student 클래스의 개게들이 담겨질 수 있는 타입 인 것.
	
	public StudentExpel() {
		expelStudents = new ArrayList<Student>();	//초기화
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		expelStudents.add(new Student(name, age, studentNum, major));	//Student 타입이기 때문에 Student 객체로 만들어야 된다..?
	}
	
}
