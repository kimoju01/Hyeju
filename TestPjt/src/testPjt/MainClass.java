package testPjt;

public class MainClass {
	
	public static void main(String[] args) {	//���α׷��� ���� ���� ���۵Ǵ� �κ�
		//Ŭ�����κ��� 'new'�� �̿��ؼ� ��ü�� �����Ѵ�.
		
		Grandeur myCar1 = new Grandeur();	
		//new Grandeur�ϴ� ���� Grandeur Ŭ������ ������ ȣ��. �޸𸮻� ��ü �ϳ� �������.

		//�Ӽ�
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 1000000;
		
		//���
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
