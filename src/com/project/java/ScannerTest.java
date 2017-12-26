package com.project.java;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stud

		int num1;
		double num2;
		String str;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		num1 = in.nextInt();
		System.out.print("Enter a floating number: ");
		num2 = in.nextDouble();
		System.out.print("Enter a String: ");
		str = in.next();

		System.out.printf("hi %s, Sum of %2d and %2.2f is %f%n", str, num1, num2, num1 + num2);

		in.close();

	}

}
