package com.project.java;

import java.util.Scanner;

public class MagicSum {

	public static boolean hasEight(int number) {
		String eight = String.valueOf(number);
		int i = 0;
		int count = 0;

		while (i < eight.length()) {

			if (eight.charAt(i) != '0' && eight.charAt(i) % 8 == 0) {
				count++;
			}
			i++;
		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sentinel = -1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = in.nextInt();
		int sum = 0;

		// int[] magic = new int[];
		while (number != sentinel) {

			if (hasEight(number)) {

				sum += number;

			}

			System.out.println("Enter a number");
			number = in.nextInt();
		}

		System.out.println("The MagicSum is: " + sum);

		/*
		 * MagicSum ab = new MagicSum();
		 * 
		 * System.out.println(ab.hasEight(number));
		 */
		in.close();
	}

}
