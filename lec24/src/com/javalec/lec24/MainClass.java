package com.javalec.lec24;

public class MainClass {
	
	public static void main(String[] args) {
		
		//String str = "JAVA";				//요렇게 써도 상관은 없지만
		String str = new String("JAVA");	//String도 클래스이기때문에 요렇게 쓸 수도 있다.
		
		System.out.println("str : " + str);
		
		str = str + "_8";
		System.out.println("str : " + str);
		
		//StringBuffer
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : " + sf);
		sf.append(" World");
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "~~~");	//글자 끝(길이 끝)에다가 ~~~를 추가하겠다.	 insert(위치, 어떤 글자)
		System.out.println("sf : " + sf);
		
		sf.delete(4, 8);	//4번째부터 8번째 글자까지 삭제하겠다
		System.out.println("sf : " + sf);
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("JAVA World!");
		System.out.println("sb : " + sb);
		
		
	}

}
