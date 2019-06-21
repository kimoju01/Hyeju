package testPjt;

public class Bicycle {

	public String color;
	public int price;
	
	public Bicycle() {	//디폴트 생성자
		System.out.println("Bicycle constructor - I");
	}
	
	public Bicycle(String c, int p) {	//생성자를 여러개 둬서 생성과 동시에 객체의 속성을 정할 수 있다. 중복 메서드(overloading)
		System.out.println("Bicycle constructor - II");
		color = c;	//지금 이 객체의 color에 c를 대입한다.
					//c라는 것은 이 객체를 생성할 때 생성자를 호출해주는 곳에서(?) 값을 던져준다
		price = p;
	}
	
	public void info() {	//색상, 가격이 어떤지 정보 조회할 때 info 메서드 호출하면 된다.
		System.out.println("--info()--");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
