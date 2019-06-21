package com.javalec.lec21_1;

import com.javalec.toy.Toy;
import com.javalec.toy.ToyAirplane;
import com.javalec.toy.ToyRobot;

public class MainClass {
	
	public static void main(String[] args) {
		
		Toy robot = new ToyRobot();			//ToyRobot, ToyAirplane 객체 생성
		Toy airplane = new ToyAirplane();	//Toy라는 인터페이스로 데이터 타입 통일 시킴
			
		Toy toys[] = {robot, airplane};		//데이터타입이 Toy로 같기 때문에 같은 배열에 담길 수 있음.
		
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}

}
