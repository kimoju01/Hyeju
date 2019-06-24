package com.java.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();
		
		while (sc.hasNextLine()) {
			String text = sc.nextLine();
			if(text.startsWith(" ") || text.endsWith(" ") || text.length() > 100 || text.isEmpty()) {
				break;
			}
			input.add(text);
		}
		
		sc.close();
		
		for(int i = 0; i < input.size(); i++) {
			System.out.println(input.get(i));
		}

	}

}
