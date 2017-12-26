package com.project.java;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 8;

		for (int row = 1; row <= size; row++) {

			if (row % 2 == 0) {
				System.out.print(" ");
			}

			for (int col = 1; col <= size; col++) {

				if (col % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}

			}
			System.out.println();

		}

		System.out.println();
		// ==================================================//
		size = 8;

		for (int row = 1; row <= size; row++) {

			for (int col = 1; col <= size + 1 - row; col++) {

				System.out.print("# ");

			}

			System.out.println();

		}

		System.out.println();
		// ==================================================//

		size = 8;

		for (int row = 1; row <= size; row++) {

			for (int i = 1; i < row; i++) {
				System.out.print("  ");
			}

			for (int col = row; col <= size; col++) {

				System.out.print("# ");

			}

			System.out.println();

		}

		System.out.println();
		// ==================================================//
		
		size = 8;

		for (int row = 1; row <= size; row++) {

			for (int col = row; col > 0; col--) {

				System.out.print(col+" ");

			}

			System.out.println();

		}

		System.out.println();
		// ==================================================//
		

		
		size = 8;

		for (int row = 1; row <= size; row++) {
			
			for (int i = row; i < size; i++) {
				System.out.print("  ");
			}
			
			
			for (int col = 1; col <= row; col++) {

				System.out.print(col+" ");

			}

			System.out.println();

		}

		System.out.println();
		// ==================================================//
		
	}

}
