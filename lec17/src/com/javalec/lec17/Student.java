package com.javalec.lec17;

public class Student {
	
	private String name;
	private int score;
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println(" -- getInfo() --");
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}

	public String getName() {
		return name;
	}

	/*
	public void setName(String name) {
		this.name = name;
	}
	*/

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score > 50)		//setter를 설정하면 조건을 달 수 있어서 더욱 안전하다.
			this.score = score;
	}
	
	

}
