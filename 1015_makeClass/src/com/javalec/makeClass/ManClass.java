package com.javalec.makeClass;

public class ManClass {
	
	private int age;	//'age' ��� ������. �ν��Ͻ� ������� �Ѵ�. 
	private double height;	//private�� height�� ���� �� Ŭ���� �ȿ����� �� �� �ִ�. �ٸ� Ŭ���������� ���Ұ�.
	private int weight;
	private String phoneNum;
	
	public ManClass() {		//�޼ҵ尡 �� ���� ������ �� �ִ�. �Ķ���ͷ� ����.
		// TODO Auto-generated constructor stub
	}
	
	public ManClass(int age, double height, int weight, String phoneNum) {
		this.age = age;			//�Ķ���� ���� age�� �� ��ü�� age������ �Ҵ� ���ְڴ�. 
		this.height = height;	//this Ű����� ��ü �� �ڽ�. ��ü�� height�ϱ� �� ���� ������ height��
		this.weight = weight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {	//Ŭ���� ���ο� ���� �޼ҵ� private�� �ϸ� MainClass���� ȣ�� �Ұ�.
		double result = weight / (height * height);	//Ű�� m �������� BMI ����� ����
		return result;
	}

	public int getAge() {	//����� ��Ŭ�� - Source - Getter Setter
		return age;			//age, height���� private�� �صθ� �ٸ� Ŭ�������� Ȱ���� �Ұ����ؼ�
	}						//�ٸ� Ŭ�������� ���� �����ų� �����Ҷ� getter, setter�� ����ϸ�ȴ�.
							//�����ϰ� �ϱ� ������ setter�� ���������� ��!
	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
