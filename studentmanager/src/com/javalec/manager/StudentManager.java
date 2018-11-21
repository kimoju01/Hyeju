package com.javalec.manager;

import java.util.ArrayList;

/* 학사관리 시스템 클래스 */
public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {		//메인함수부터 시작
		StudentManager studentManager = new StudentManager();
		
	    studentManager.addStudent("홍길동", 22, 20123487, "연극영화");
		studentManager.addStudent("홍길순", 24, 20106847, "수학");
	    studentManager.addStudent("이은경", 21, 20149485, "국문");
	    studentManager.addStudent("김철수", 23, 20152342, "체육");
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " 학생 정보 입력 성공 !! ");
	}

}
