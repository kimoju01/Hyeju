package com.javalec.lec28_2;

import java.io.IOException;
import java.net.Socket;

public class MainClassSocket {
	
	public static void main(String[] args) {
		
		Socket socket = null;	//네트워크 연결 장치(소켓) 만들고 포트번호만 설정하면 끝
		
		try {
			socket = new Socket("localhost", 9000); //127.0.0.1
			System.out.println("서버 연결");
			System.out.println("socket : " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
