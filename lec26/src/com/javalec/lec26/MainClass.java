package com.javalec.lec26;

public class MainClass {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;	//���⼭ ����ó���� �� �ϸ� ���ܰ� �߻��ϴ� ���� �ý����� ��������� ������ �� �κ� �ؿ� �ִ� �ڵ�(Exception AFTER ���)�� ������� �ʴ´�.
						//�׷��� ����ó���� �ؼ� ������ �ڵ尡 ����� �� �ְ� ���ش�.
		} catch (Exception e) { 
			e.printStackTrace();			//��� ���ܰ� �߻��ߴ��� ������ش�.
			String msg = e.getMessage();	//���ܸ� �����ϰ� �����ش�.
			System.out.println("msg : " + msg);
		} finally {
			System.out.println("���� �߻� ���ο� ������� ������ ���� �˴ϴ�.");
		}
		
		System.out.println("Exception AFTER");
	}

}
