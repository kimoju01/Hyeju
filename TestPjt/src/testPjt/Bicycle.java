package testPjt;

public class Bicycle {

	public String color;
	public int price;
	
	public Bicycle() {	//����Ʈ ������
		System.out.println("Bicycle constructor - I");
	}
	
	public Bicycle(String c, int p) {	//�����ڸ� ������ �ּ� ������ ���ÿ� ��ü�� �Ӽ��� ���� �� �ִ�. �ߺ� �޼���(overloading)
		System.out.println("Bicycle constructor - II");
		color = c;	//���� �� ��ü�� color�� c�� �����Ѵ�.
					//c��� ���� �� ��ü�� ������ �� �����ڸ� ȣ�����ִ� ������(?) ���� �����ش�
		price = p;
	}
	
	public void info() {	//����, ������ ��� ���� ��ȸ�� �� info �޼��� ȣ���ϸ� �ȴ�.
		System.out.println("--info()--");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
