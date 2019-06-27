package com.java.ex;

class SutdaDeck {
	final int CARD_NUM = 20;		//카드의 개수
	SutdaCard[] cards = new SutdaCard[CARD_NUM];		//Card 객체 배열을 포함. Deck 클래스를 작성하는데 Card클래스를 재사용하여 포함관계로 작성하였다. (카드 한 벌(Deck)은 카드를 가지고 있다)
	
	SutdaDeck() {		//생성자. 
		for(int i=0; i<cards.length; i++) {
			int num = i%10 + 1; 
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
		
	void shuffle() {		//메서드. 카드의 순서를 섞는다.
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random() * cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {		//지정된 위치에 있는 카드 하나를 꺼내서 반환. return이 있기 때문에 반환형을 설정해줘야해서 cards 배열의 타입형인 SutdaCard를 설정해준것!!
		if(index < 0 || index >= CARD_NUM)	//index가 0보다 작거나 카드 갯수보다 크면(20개)
			return null;	//null을 반환
		return cards[index];	//그게 아니라면 index 번째의 카드를 뽑아서 반환
	}
	
	SutdaCard pick() {		//Deck에서 카드 하나를 선택한다. 
		int index = (int)(Math.random() * cards.length);
		return pick(index);
	}
}

//요까지 SutdaDeck





class SutdaCard {
	int num;			//속성
	boolean isKwang;	//속성
	
	SutdaCard() {		//생성자. SutdaCard[] cards = new SutdaCard[CARD_NUM]; 으로 이 생성자가 호출된다.
		this(1, true);	//num = 1, isKwang = true => 1K
	}
	
	SutdaCard(int num, boolean isKwang) {		//생성자
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang? "K" : "");
	}
}


//요까지 SutdaCard





public class Main {
	
	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		//SutdaDeck 생성자에서 num과 isKwang을 판별한다.
		
		System.out.println(deck.pick(0));	//제일 위(0번째)의 카드를 뽑아서 출력한다. 
		//위의 문장과 System.out.println(deck.pick(0).toString());랑 같은 의미이다. 포함관계라 deck 클래스 안에 card 클래스가 있어서 toString도 도트 연산자로 사용 가능한 것..? 
		System.out.println(deck.pick());	//덱에서 아무 카드나 한 장 뽑는다(랜덤)
		deck.shuffle();		//카드를 섞는다	
		
		for(int i=0; i<deck.cards.length; i++) 	//섞은 카드 20장을 쭉 출력한다
			System.out.printf(deck.cards[i]+",");
		
		System.out.println();	//그냥 just 줄바꿈!! 왜냐면 위에 printf문이 ,(콤마)로 끝나기 때문에 보기 좋게 하라고 줄바꿈 해줌
		System.out.println(deck.pick(0));	//아무 카드 한 장 뽑는다
	}
	
		
}


