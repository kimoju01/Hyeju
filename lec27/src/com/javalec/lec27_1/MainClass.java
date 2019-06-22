package com.javalec.lec27_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("D:\\ExJava\\hello.txt");
			os = new FileOutputStream("D:\\ExJava\\helloCopy.txt");	//데이터 복사하기.
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = is.read(arr);
				if(len == -1) break;
				os.write(arr, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
			
			if(os != null) {
				try {
					os.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
	}
}
