package com.project.java;

public class PrintFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Hello%2d and%6s%n", 855544, "12345");
		System.out.println("sdjfhkjdfj");
		System.out.printf("Hi,%s%4d%n", "Hello", 8888);
		
		int[][] grid = new int[12][8]; // A 12x8 grid, in [row][col] or [y][x]
		int numRows = grid.length; // 12
		int numCols = grid[0].length; // 8
		// Fill in grid
		for (int row = 0; row < numRows; ++row) {
		for (int col = 0; col < numCols; ++col) {
		grid[row][col] = row*numCols + col + 1;
		}
		}
		// Print grid
		for (int row = 0; row < numRows; ++row) {
		for (int col = 0; col < numCols; ++col) {
		System.out.printf("%3d", grid[row][col]);
		}
		System.out.println();
		}

	}

}
