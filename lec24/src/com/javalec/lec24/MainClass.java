package com.javalec.lec24;

public class MainClass {
	
	public static void main(String[] args) {
		
		//String str = "JAVA";				//�䷸�� �ᵵ ����� ������
		String str = new String("JAVA");	//String�� Ŭ�����̱⶧���� �䷸�� �� ���� �ִ�.
		
		System.out.println("str : " + str);
		
		str = str + "_8";
		System.out.println("str : " + str);
		
		//StringBuffer
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : " + sf);
		sf.append(" World");
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "~~~");	//���� ��(���� ��)���ٰ� ~~~�� �߰��ϰڴ�.	 insert(��ġ, � ����)
		System.out.println("sf : " + sf);
		
		sf.delete(4, 8);	//4��°���� 8��° ���ڱ��� �����ϰڴ�
		System.out.println("sf : " + sf);
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("JAVA World!");
		System.out.println("sb : " + sb);
		
		
	}

}
