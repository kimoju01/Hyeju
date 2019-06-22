package com.javalec.lec27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		
		//read : 1byte�� �б�
		InputStream is = null;
		
		try {
			is = new FileInputStream("D:\\ExJava\\hello.txt");	//������ �о�´�.
			int data = 0;
			
			while(true) {
				try {	//IO�� ��Ʈ��ũ�� ���õ� ���� ������ ����ó���� ������Ѵ�.
					data = is.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;	//�� �̻� ���� ���� ������ break�� �������´�.
				System.out.println("data : " + data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=========================================");
		
		
		//read(byte[]) : �迭 ũ�� ��ŭ �б�
		InputStream isb = null;
		
		try {
			isb = new FileInputStream("D:\\ExJava\\hello.txt");	//������ �о�´�.
			int data = 0;
			byte[] bs = new byte[3];
			
			while(true) {
				try {	//IO�� ��Ʈ��ũ�� ���õ� ���� ������ ����ó���� ������Ѵ�.
					data = isb.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;	//�� �̻� ���� ���� ������ break�� �������´�.
				System.out.println("data : " + data);
				for(int i = 0; i < bs.length; i++) {
					System.out.println("bs[" + i + "] : " + bs[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=========================================");
		
		
		//write()
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("D:\\ExJava\\hello.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			
			try {
				os.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=========================================");
		
		//write()
		OutputStream osb = null;
				
				try {
					osb = new FileOutputStream("D:\\ExJava\\hello.txt");
					String data = "Hello java world!!";
					byte[] arr = data.getBytes();
					
					try {
						osb.write(arr, 0, 5);	//0�������� 5������ ���Ͽ� ����. ��, Hello ������ ��µ� ��.
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
						if(osb != null) osb.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
		System.out.println("=========================================");
		
	}
}
