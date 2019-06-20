package testPjt;

public class MainClass {
	
	public static void main(String[] args) {	//프로그램이 가장 먼저 시작되는 부분
		//클래스로부터 'new'를 이용해서 객체를 생성한다.
		
		Grandeur myCar1 = new Grandeur();	
		//new Grandeur하는 순간 Grandeur 클래스의 생성자 호출. 메모리상에 객체 하나 만들어짐.

		//속성
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 1000000;
		
		//기능
		myCar1.run();
		myCar1.stop();
		myCar1.info();

		
		Grandeur myCar2 = new Grandeur();
		myCar2.color = "blue";
		myCar2.gear = "auto";
		myCar2.price = 5000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		
		
		Bicycle myBicycle1 = new Bicycle();
		myBicycle1.color = "red";
		myBicycle1.price = 10000;
		
		myBicycle1.info();
		
		
		
		Bicycle myBicycle2 = new Bicycle("blue", 20000);
		myBicycle2.info();
		
		myBicycle2.color = "yellow";
		myBicycle2.info();
	}
}
