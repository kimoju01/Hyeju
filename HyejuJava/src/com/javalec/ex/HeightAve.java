package com.javalec.ex;

import java.util.Scanner;

public class HeightAve {

	public static void main(String[] args) {
		
		String[] ArrName = {"영희", "철수", "길동", "영수", "말자"};
		int[] Arr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<Arr.length; i++) {
			System.out.println(ArrName[i] + "키를 입력 하세요. : ");
			Arr[i] = scanner.nextInt();
			totalHeight = totalHeight + Arr[i];
		}
		
		System.out.println("학생들의 평균 신장은 " + (totalHeight/ArrName.length) + "입니다.");
		
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i] > maxH) {
				maxH = Arr[i];
				maxHIndex = i;
			}
			
		}
		System.out.println("가장 큰 학생은 " + ArrName[maxHIndex] + "입니다.");
		
		minH = maxH;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i] < minH) {
				minH = Arr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + ArrName[minHIndex] + "입니다.");
	}

}
