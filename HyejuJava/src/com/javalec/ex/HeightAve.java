package com.javalec.ex;

import java.util.Scanner;

public class HeightAve {

	public static void main(String[] args) {
		
		String[] ArrName = {"����", "ö��", "�浿", "����", "����"};
		int[] Arr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<Arr.length; i++) {
			System.out.println(ArrName[i] + "Ű�� �Է� �ϼ���. : ");
			Arr[i] = scanner.nextInt();
			totalHeight = totalHeight + Arr[i];
		}
		
		System.out.println("�л����� ��� ������ " + (totalHeight/ArrName.length) + "�Դϴ�.");
		
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i] > maxH) {
				maxH = Arr[i];
				maxHIndex = i;
			}
			
		}
		System.out.println("���� ū �л��� " + ArrName[maxHIndex] + "�Դϴ�.");
		
		minH = maxH;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i] < minH) {
				minH = Arr[i];
				minHIndex = i;
			}
		}
		System.out.println("���� ���� �л��� " + ArrName[minHIndex] + "�Դϴ�.");
	}

}
