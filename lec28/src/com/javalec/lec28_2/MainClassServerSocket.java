package com.javalec.lec28_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {
	
	public static void main(String[] args) {
		
		//������ ���� ������Ѿ� Ŭ���̾�Ʈ�� ���� ����
		ServerSocket serverSocket = null;	//�����ʿ��� ��û�� �޾ƾ��ϴϱ� serversocket �ϳ��� �� ������ �ȴ�.
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�");
			
			socket = serverSocket.accept();	//Ŭ���̾�Ʈ�� ������ accept�� �޾Ƶ��δ�
			System.out.println("Ŭ���̾�Ʈ ����");
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
