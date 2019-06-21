package com.javalec.lec21_1;

import com.javalec.toy.Toy;
import com.javalec.toy.ToyAirplane;
import com.javalec.toy.ToyRobot;

public class MainClass {
	
	public static void main(String[] args) {
		
		Toy robot = new ToyRobot();			//ToyRobot, ToyAirplane ��ü ����
		Toy airplane = new ToyAirplane();	//Toy��� �������̽��� ������ Ÿ�� ���� ��Ŵ
			
		Toy toys[] = {robot, airplane};		//������Ÿ���� Toy�� ���� ������ ���� �迭�� ��� �� ����.
		
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}

}
