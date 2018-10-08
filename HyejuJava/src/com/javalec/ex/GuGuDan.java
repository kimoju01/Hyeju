/* 구구단 출력 */

package com.javalec.ex;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		GuGuDan guGuDan = new GuGuDan();
		guGuDan.gugudan(input);	//gugudan 메소드 호출 객체명.메소드명 
	}
	
	public void gugudan(int i) {
		for(int j=1; j<10; j++) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
	}

}
