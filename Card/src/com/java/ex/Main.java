package com.java.ex;

class SutdaDeck {
	final int CARD_NUM = 20;		//ī���� ����
	SutdaCard[] cards = new SutdaCard[CARD_NUM];		//Card ��ü �迭�� ����. Deck Ŭ������ �ۼ��ϴµ� CardŬ������ �����Ͽ� ���԰���� �ۼ��Ͽ���. (ī�� �� ��(Deck)�� ī�带 ������ �ִ�)
	
	SutdaDeck() {		//������. 
		for(int i=0; i<cards.length; i++) {
			int num = i%10 + 1; 
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
		
	void shuffle() {		//�޼���. ī���� ������ ���´�.
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random() * cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {		//������ ��ġ�� �ִ� ī�� �ϳ��� ������ ��ȯ. return�� �ֱ� ������ ��ȯ���� ����������ؼ� cards �迭�� Ÿ������ SutdaCard�� �������ذ�!!
		if(index < 0 || index >= CARD_NUM)	//index�� 0���� �۰ų� ī�� �������� ũ��(20��)
			return null;	//null�� ��ȯ
		return cards[index];	//�װ� �ƴ϶�� index ��°�� ī�带 �̾Ƽ� ��ȯ
	}
	
	SutdaCard pick() {		//Deck���� ī�� �ϳ��� �����Ѵ�. 
		int index = (int)(Math.random() * cards.length);
		return pick(index);
	}
}

//����� SutdaDeck





class SutdaCard {
	int num;			//�Ӽ�
	boolean isKwang;	//�Ӽ�
	
	SutdaCard() {		//������. SutdaCard[] cards = new SutdaCard[CARD_NUM]; ���� �� �����ڰ� ȣ��ȴ�.
		this(1, true);	//num = 1, isKwang = true => 1K
	}
	
	SutdaCard(int num, boolean isKwang) {		//������
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang? "K" : "");
	}
}


//����� SutdaCard





public class Main {
	
	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		//SutdaDeck �����ڿ��� num�� isKwang�� �Ǻ��Ѵ�.
		
		System.out.println(deck.pick(0));	//���� ��(0��°)�� ī�带 �̾Ƽ� ����Ѵ�. 
		//���� ����� System.out.println(deck.pick(0).toString());�� ���� �ǹ��̴�. ���԰���� deck Ŭ���� �ȿ� card Ŭ������ �־ toString�� ��Ʈ �����ڷ� ��� ������ ��..? 
		System.out.println(deck.pick());	//������ �ƹ� ī�峪 �� �� �̴´�(����)
		deck.shuffle();		//ī�带 ���´�	
		
		for(int i=0; i<deck.cards.length; i++) 	//���� ī�� 20���� �� ����Ѵ�
			System.out.printf(deck.cards[i]+",");
		
		System.out.println();	//�׳� just �ٹٲ�!! �ֳĸ� ���� printf���� ,(�޸�)�� ������ ������ ���� ���� �϶�� �ٹٲ� ����
		System.out.println(deck.pick(0));	//�ƹ� ī�� �� �� �̴´�
	}
	
		
}


