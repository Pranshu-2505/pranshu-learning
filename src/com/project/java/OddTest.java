package com.project.java;

import java.util.Scanner;

public class OddTest {

	//public static 
	private boolean isOdd(int number) {
		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number=in.nextInt();
		
		OddTest ab = new OddTest();
		
		System.out.println(ab.isOdd(number));
		in.close();

	}

}
