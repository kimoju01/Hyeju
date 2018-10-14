package com.javalec.makeClass;

public class ManClass {
	
	private int age;	//'age' 라는 데이터. 인스턴스 변수라고 한다. 
	private double height;	//private는 height의 값을 이 클래스 안에서만 쓸 수 있다. 다른 클래스에서는 사용불가.
	private int weight;
	private String phoneNum;
	
	public ManClass() {		//메소드가 두 개도 존재할 수 있다. 파라미터로 구분.
		// TODO Auto-generated constructor stub
	}
	
	public ManClass(int age, double height, int weight, String phoneNum) {
		this.age = age;			//파라미터 값인 age를 이 객체의 age값으로 할당 해주겠다. 
		this.height = height;	//this 키워드는 객체 나 자신. 객체의 height니까 젤 위에 선언한 height임
		this.weight = weight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {	//클래스 내부에 만든 메소드 private로 하면 MainClass에서 호출 불가.
		double result = weight / (height * height);	//키가 m 단위여야 BMI 계산이 가능
		return result;
	}

	public int getAge() {	//빈공간 우클릭 - Source - Getter Setter
		return age;			//age, height등을 private로 해두면 다른 클래스에서 활용이 불가능해서
	}						//다른 클래스에서 값을 얻어오거나 변경할때 getter, setter를 사용하면된다.
							//변경하게 하기 싫으면 setter를 지워버리면 됨!
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
