package com.project.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the String: ");

		String string = in.next();

		System.out.println(string.length());

		for (int i = string.length(); i > 0; i--) {

			char c = string.charAt(i - 1);

			System.out.print(c);

		}

		in.close();
	}

}
