package com.project.java;

public class TimeTable {

	public static void main(String[] args) {
		System.out.println("* |  1  2  3  4  5  6  7  8  9");
		System.out.println("-------------------------------");

		for (int row = 1; row <= 9; row++) {

			System.out.print(row + " ");
			System.out.print("| ");
			for (int col = 1; col <= 9; col++) {

				int product = row * col;
				String pro = Integer.toString(product);

				if (pro.length() == 2) {

					System.out.print(pro + " ");
				} else {
					System.out.print(" " + pro + " ");
				}

			}
			System.out.println();
		}
		
		System.out.println();
		//==========================================================//
		
		System.out.println(" * |  1  2  3  4  5  6  7  8  9");
		System.out.println("-------------------------------");

		for (int row = 1; row <= 12; row++) {

			System.out.printf("%2d", row);
			System.out.print(" |");
			for (int col = 1; col <= 9; col++) {

				System.out.printf("%3d", row*col);

			}
			System.out.println();
		}
		

	}

}
