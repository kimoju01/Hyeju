package com.javalec.lec28_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {
	
	public static void main(String[] args) {
		
		//서버를 먼저 실행시켜야 클라이언트도 실행 가능
		ServerSocket serverSocket = null;	//서버쪽에선 요청을 받아야하니까 serversocket 하나만 더 있으면 된다.
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료");
			
			socket = serverSocket.accept();	//클라이언트가 들어오면 accept로 받아들인다
			System.out.println("클라이언트 연결");
			System.out.println("socket : " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
