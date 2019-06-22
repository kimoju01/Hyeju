package com.javalec.lec27_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	
	public static void main(String[] args) {
		
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\ExJava\\helloWorld.txt");
			dis = new DataInputStream(is);
			//FileInputStream으로 부터 상위 클래스인 is(InputStream)를 얻어낼 수 있는데, 
			//is가 byte단위기 때문에 불편해서 문자열 단위로 이용하기 위해 DataInputStream을 이용하는데
			//즉, is(InputStream)을 DataInputStream의 생성자 매개변수로 넣어서 확장한 개념...?
			//InputStream을 확장해서 DataInputStream을 만든다..?
			
			String str = dis.readUTF();	//문자열 단위로 읽는다.
			
			os = new FileOutputStream("D:\\ExJava\\helloWorldCopy.txt");
			dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(os != null) os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
