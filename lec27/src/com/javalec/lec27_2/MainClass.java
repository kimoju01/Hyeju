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
			//FileInputStream���� ���� ���� Ŭ������ is(InputStream)�� �� �� �ִµ�, 
			//is�� byte������ ������ �����ؼ� ���ڿ� ������ �̿��ϱ� ���� DataInputStream�� �̿��ϴµ�
			//��, is(InputStream)�� DataInputStream�� ������ �Ű������� �־ Ȯ���� ����...?
			//InputStream�� Ȯ���ؼ� DataInputStream�� �����..?
			
			String str = dis.readUTF();	//���ڿ� ������ �д´�.
			
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
