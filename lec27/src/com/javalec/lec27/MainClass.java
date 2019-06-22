package com.javalec.lec27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		
		//read : 1byte씩 읽기
		InputStream is = null;
		
		try {
			is = new FileInputStream("D:\\ExJava\\hello.txt");	//파일을 읽어온다.
			int data = 0;
			
			while(true) {
				try {	//IO나 네트워크에 관련된 것은 무조건 예외처리를 해줘야한다.
					data = is.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;	//더 이상 읽을 것이 없으면 break로 빠져나온다.
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
		
		
		//read(byte[]) : 배열 크기 만큼 읽기
		InputStream isb = null;
		
		try {
			isb = new FileInputStream("D:\\ExJava\\hello.txt");	//파일을 읽어온다.
			int data = 0;
			byte[] bs = new byte[3];
			
			while(true) {
				try {	//IO나 네트워크에 관련된 것은 무조건 예외처리를 해줘야한다.
					data = isb.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;	//더 이상 읽을 것이 없으면 break로 빠져나온다.
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
						osb.write(arr, 0, 5);	//0에서부터 5까지만 파일에 쓴다. 즉, Hello 까지만 출력될 것.
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
